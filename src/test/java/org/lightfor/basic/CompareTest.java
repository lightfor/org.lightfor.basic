package org.lightfor.basic;

import org.junit.Test;

/**
 * compare test
 * Created by Light on 2017/6/28.
 */
public class CompareTest {
    @Test(expected = NullPointerException.class)
    public void test(){
        System.out.println("1".compareTo(null));
    }
}
