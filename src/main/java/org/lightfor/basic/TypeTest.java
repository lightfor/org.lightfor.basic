package org.lightfor.basic;

/**
 * 类型测试类
 * Created by Light on 2017/6/10.
 */
public class TypeTest {
    public static void main(String[] args) {
        //float f = 3.4;
        float f = 3.4f;

        short s1 = 1;
        //s1 = s1 + 1;
        s1 += 1;
        s1 = (short)(s1 + 1);

        //goto

        int i = 0;
        Integer j = 0;

        boolean b = 1 ==1 & 1 == 2;
        b = 1 ==1 && 1 == 2;

        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        //switch byte, long, String
        String[] strArr = new String[5];
        System.out.println(strArr.length);
        String str = "";
        System.out.println(str.length());

        //break;
        //continue;

        char chsTest = '测';

        String s = new String("abc");



    }
}
