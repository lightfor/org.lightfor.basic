package org.lightfor.basic;

import org.junit.Test;

/**
 * loop statement test
 * Created by Light on 2017/8/27.
 */
public class LoopStatementTest {

    @Test
    public void test(){
        int i = 0;
        do {
            i++;
            System.out.println("1");
        } while (i < 3 ); // focus ";"
    }
}
