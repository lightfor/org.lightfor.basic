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
        System.out.println(a.equals(b));
    }
}
