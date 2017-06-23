package org.lightfor.basic;

import org.junit.Test;

/**
 * static test
 * Created by Light on 2017/6/23.
 */
public class StaticTest {

    private static void testMethod(){
        System.out.println("testMethod");
    }

    @Test
    public void test4() {
        ((StaticTest)null).testMethod();
    }
}
