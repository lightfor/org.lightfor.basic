package org.lightfor.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Exception Test
 * Created by Light on 2017/6/17.
 */
public class ExceptionTest {


    public void test1() {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int test2() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    public int test4() {
        try {
            return 1 / 0;
        } catch (Exception e){
            throw e;
        } finally {
            return 1;
        }
    }

    @Test
    public void test3(){
        System.out.println(test4());
    }

    @Test(expected = ArithmeticException.class)
    public void test5() {
        System.out.println(1/0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test6(){
        int[] i = new int[2];
        System.out.println(i[2]);
    }

    @Test(expected = ArrayStoreException.class)
    public void test7(){
        Object x[] = new String[3];
        x[0] = new Integer(0);
    }

    @Test(expected = ClassCastException.class)
    public void test8(){
        Object x = new Integer(0);
        System.out.println((String)x);
    }

    @Test(expected = ClassNotFoundException.class)
    public void test9() throws ClassNotFoundException {
        Class.forName("org.lightfor.ClassNotFound");
    }

    @Test(expected = UnsatisfiedLinkError.class)
    public void test10() throws CloneNotSupportedException {
        class A {
            @Override
            public native Object clone() throws CloneNotSupportedException;
        }

        A a = new A();
        a.clone();
    }

    public void test11(){
        //CloneNotSupportedException
    }

    public void test12(){
        class A {
            private A(){
            }
        }

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test13(){
        List<String> list = new ArrayList<>();
        System.out.println(list.get(0));
    }

    @Test(expected = NegativeArraySizeException.class)
    public void test14(){
        int[] arr = new int[-1];
    }

    @Test(expected = NullPointerException.class)
    public void test15(){
        System.out.println("1".compareTo(null));
    }

    @Test
    public void test16(){
        List<Thread> list = new ArrayList<>();
        while(true) {
            list.add(new Thread());
        }
    }

}
