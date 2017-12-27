package org.lightfor.basic;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * number test
 * Created by Light on 2017/8/6.
 */
public class NumberTest {

    @Test
    public void test(){
        BigDecimal a = new BigDecimal(0.00);
        BigDecimal b = new BigDecimal("0.00");
        BigDecimal c = new BigDecimal(0.000);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        System.out.println(a.equals(c));
    }

    @Test
    public void test1() {
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        System.out.println(Math.floor(11.5));
        System.out.println(Math.floor(-11.5));
    }
}
