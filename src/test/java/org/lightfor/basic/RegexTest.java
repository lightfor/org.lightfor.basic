package org.lightfor.basic;

/**
 * regex test
 * Created by Light on 2017/6/8.
 */
public class RegexTest {

    public static void main(String[] args) {
        System.out.println("a\nb\nc".split("\\n").length);

        System.out.println("a\nb\nc".split("\n").length);
    }
}
