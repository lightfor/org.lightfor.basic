package org.lightfor.basic;

import org.junit.Test;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Thread Test
 * Created by Light on 2017/6/22.
 */
public class ThreadTest {

    @Test
    public void test2() {
         /*Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("1");
            }
        };*/
        Thread thread = new Thread(() -> System.out.println("1"));
        thread.start();
    }

    @Test
    public void test3() {
        Thread thread = new Thread(() -> System.out.println("1"));
        thread.run();
    }

    @Test//just once
    public void test4() {
        Thread thread = new Thread(() -> System.out.println("1"));
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(thread, 0, 1000, TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) {
        new ThreadTest().test4();// maintain running
    }

    //wait notify can apply to consumer-producer model
    @Test
    public void test5() {
        class ThreadB extends Thread{
            private int total;

            @Override
            public void run(){
                synchronized(this){
                    for(int i=0; i < 10 ;  i++){
                        total += i;
                    }
                    notify();
                }

            }
        }

        ThreadB thread = new ThreadB();
        thread.start();

        synchronized (this) {
            try{
                System.out.println("Waiting for b to complete...");
                thread.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(thread.total);

    }

    @Test
    public void test6(){
        class ThreadB extends Thread{
            private int total;

            @Override
            public void run(){
                for(int i=0; i < 10 ;  i++){
                    total += i;
                }
            }
        }

        ThreadB thread = new ThreadB();
        thread.start();

        System.out.println(thread.total);
    }

    //2000 or smaller than 2000, sometimes ArrayIndexOutOfBoundsException, not thread safe
    @Test
    public void test7() throws InterruptedException {
        class ThreadSB extends Thread{
            private StringBuilder sb;
            private CountDownLatch countDownLatch;

            private ThreadSB(StringBuilder sb, CountDownLatch countDownLatch){
                this.sb = sb;
                this.countDownLatch = countDownLatch;
            }

            @Override
            public void run(){
                for(int i = 0 ; i < 1000; i++){
                    sb.append(" ");
                }
                countDownLatch.countDown();
            }
        }

        StringBuilder sb = new StringBuilder();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ThreadSB a = new ThreadSB(sb, countDownLatch);
        ThreadSB b = new ThreadSB(sb, countDownLatch);
        a.start();
        b.start();

        countDownLatch.await();
        System.out.println(sb.length());
    }

    //always 2000, thread safe
    @Test
    public void test8() throws InterruptedException {
        class ThreadSB extends Thread{
            private StringBuffer sb;
            private CountDownLatch countDownLatch;
            private ThreadSB(StringBuffer sb, CountDownLatch countDownLatch){
                this.sb = sb;
                this.countDownLatch = countDownLatch;
            }

            @Override
            public void run(){
                for(int i = 0 ; i < 10000; i++){
                    sb.append(" ");
                }
                countDownLatch.countDown();
            }
        }

        StringBuffer sb = new StringBuffer();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ThreadSB a = new ThreadSB(sb, countDownLatch);
        ThreadSB b = new ThreadSB(sb, countDownLatch);
        a.start();
        b.start();

        countDownLatch.await();
        System.out.println(sb.length());
    }

    @Test
    public void test9() throws InterruptedException {
        class ThreadCount extends Thread{
            private final CountDownLatch countDownLatch;
            private final AtomicInteger atomicInteger;

            private ThreadCount(CountDownLatch countDownLatch, AtomicInteger atomicInteger){
                this.countDownLatch = countDownLatch;
                this.atomicInteger = atomicInteger;
            }

            @Override
            public void run(){
                while(true) {
                    synchronized (atomicInteger) {
                        if(atomicInteger.get() > 1000000){
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + "\t" + (atomicInteger.get()));
                    }
                    atomicInteger.incrementAndGet();
                }
                countDownLatch.countDown();
            }
        }

        long start = System.currentTimeMillis();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i = 0 ; i < 4; i++){
            executorService.execute(new ThreadCount(countDownLatch, atomicInteger));
        }


        countDownLatch.await();
        executorService.shutdown();
        System.out.println(System.currentTimeMillis() - start);
        //5133
    }


    @Test
    public void test10() {
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 1000000; i ++) {
            System.out.println(Thread.currentThread().getName() + "\t" +i);
        }
        System.out.println(System.currentTimeMillis() - start);
        //3493
    }

}
