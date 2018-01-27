package org.lightfor.basic;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

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

    @Test
    //IEEE-754
    public strictfp void test2() {
        double a = 0.1;
        double b = 0.2;
        System.out.println(a+b);
    }

    @Test
    public void test3() {
        System.out.println(3.0 - 2.1);
    }

    @Test
    public void test4() {
        double v = Math.copySign(1.1, 2.1);
        System.out.println(v);
        double v1 = StrictMath.copySign(1.1, 2.1);
        System.out.println(v1);
    }

    @Test
    public void test5() {
        double v = Math.nextAfter(1.1, 1);
        System.out.println(v);
        double ulp = Math.ulp(1.1);
        System.out.println(ulp);
        double a = 1;
        for(int i = 0 ; i < 10000; i++){
            a += ulp /10;
        }
        System.out.println(a);
    }

    @Test
    public void test6() {
        float f = 1.0f;
        int i = 0;
        while(f < 2.0f) {
            f = Math.nextUp(f);
            i++;
        }
        System.out.println(i);
    }

    @Test
    public void test7() {
        BigInteger i = new BigInteger("12");
        BigInteger j = new BigInteger("5");
        BigInteger p = new BigInteger("8");
        System.out.println(i.gcd(j));
        System.out.println(i.gcd(p));
        System.out.println(i.modPow(j,p));
        System.out.println(i.pow(j.intValue()));

    }

    @Test
    public void test8() {
        System.out.println(new BigDecimal("1").divide(new BigDecimal("3"), MathContext.DECIMAL32));
        System.out.println(new BigDecimal("3").divide(new BigDecimal("2"), 2, RoundingMode.CEILING));
    }
}
