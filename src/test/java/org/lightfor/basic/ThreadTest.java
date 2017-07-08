package org.lightfor.basic;

import org.junit.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
}
