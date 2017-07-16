package org.lightfor.basic;

import org.junit.*;

/**
 * regex test
 * Created by Light on 2017/6/8.
 */
public class RegexTest {

    @Test
    public void test1() {
        System.out.println("a\nb\nc".split("\\n").length);

        System.out.println("a\nb\nc".split("\n").length);
    }

}
