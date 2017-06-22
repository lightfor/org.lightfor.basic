package org.lightfor.basic;

import org.junit.Test;

/**
 * Thread Test
 * Created by Light on 2017/6/22.
 */
public class ThreadTest {

    @Test
    public void test1(){
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("1");
            }
        };
        thread.start();
    }

    @Test
    public void test2(){
        Thread thread = new Thread(() -> System.out.println("1"));
        thread.start();
    }

    @Test
    public void test3(){
        Thread thread = new Thread(() -> System.out.println("1"));
        thread.run();
    }
}
