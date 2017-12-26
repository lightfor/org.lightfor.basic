package org.lightfor.basic;

import org.junit.Test;

public class NullTest {

    @Test
    public void test1(){
        System.out.println("1".equals(null));
    }

    @Test
    public void test2() {
        Integer a = null;
        System.out.println(a == 1);//((Integer)a).intValue() == 1
    }
}
