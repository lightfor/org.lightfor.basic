package org.lightfor.basic.staticfield;

/**
 * class 3
 * Created by Light on 2017/6/2.
 */
public class Test3 {

    static int value1 = Test4.value1;

    public static void main(String[] args) {
        System.out.println(Test3.value1);
    }
}
