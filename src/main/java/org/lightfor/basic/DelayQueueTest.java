package org.lightfor.basic;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

/**
 * reference : https://my.oschina.net/lujianing/blog/705894
 * Created by Light on 2017/5/19.
 */
public class DelayQueueTest {

    public static void main(String[] args) {
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();

        producer(delayQueue);

        consumer(delayQueue);

        while (true){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void producer(DelayQueue<DelayedElement> delayQueue){
        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                DelayedElement delayedElement = new DelayedElement(1000, "test");
                delayQueue.offer(delayedElement);
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis()+" "+delayQueue.size());
            }
        });
    }

    private static void consumer(DelayQueue<DelayedElement> delayQueue){
        new Thread(() -> {
            while (true) {
                DelayedElement delayedElement = null;
                try {
                    delayedElement = delayQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis()+" "+delayedElement);
            }
        }).start();


    }

}
