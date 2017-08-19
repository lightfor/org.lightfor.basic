package org.lightfor.basic;

import org.junit.Test;

/**
 * 类型测试类
 * Created by Light on 2017/6/10.
 */
public class TypeTest {
    public void test1() {
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

/*        class Test extends String{
        }*/

    }

    @Test
    public void test2(){
        int i=0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));
    }

    @Test
    public void test3(){
        String str=new String("hello");
        char[]ch={'a','b'};
        change(str,ch);
        System.out.print(str+" and ");
        System.out.print(ch);
    }

    private void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';
    }

    @Test
    public void test4(){
        byte byteV = 1;
        short shortV = 1;
        char charV = 1;
        int intV = 1;
        long longV = 1;
        float floatV= 1;
        double doubleV = 1;

        //reverse is incorrect
        shortV = byteV;
        intV = shortV;
        //shortV = charV;
        //charV = shortV;
        //charV = byteV;
        intV = charV;
        longV = intV;
        floatV = longV;
        doubleV = floatV;
    }

    @Test
    public void test5(){
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

        System.out.println(Short.MAX_VALUE - Short.MIN_VALUE == Character.MAX_VALUE - Character.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }

}
