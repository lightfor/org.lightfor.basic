package org.lightfor.basic.staticfield;

/**
 * class 1
 * Created by Light on 2017/6/2.
 */
public class Test1 {

    static int value2 = Test2.value1;

    static int value1 = 2;

    static final int value3 = Test2.value3;

    static final int value4 = 2;

    public static void main(String[] args) {
        System.out.println(Test1.value2);
    }

}
