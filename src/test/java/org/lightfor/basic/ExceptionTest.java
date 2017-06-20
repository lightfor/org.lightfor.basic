package org.lightfor.basic;

import org.junit.Test;

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
}
