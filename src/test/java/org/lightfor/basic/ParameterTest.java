package org.lightfor.basic;

import org.junit.Test;

/**
 * parameter test
 * Created by Light on 2017/7/10.
 */
public class ParameterTest {

    @Test
    public void test1(){
        int i = 1;
        test1_1(i);
        System.out.println(i);
        test1_2(i);
        System.out.println(i);
        Integer ii = 1;
        test1_2(ii);
        System.out.println(ii);
        String is = "1";
        test1_3(is);
        System.out.println(is);

        TestObject testObject = new TestObject();
        testObject.i = 1;
        test1_4(testObject);
        System.out.println(testObject.i);

        testObject.is = "1";
        test1_5(testObject);
        System.out.println(testObject.is);

        testObject.is = "1";
        test1_6(testObject);
        System.out.println(testObject.is);

    }

    private void test1_1(int i){
        i = 2;
    }

    private void test1_2(Integer i){
        i = 2;
    }

    private void test1_3(String i){
        i = "2";
    }

    private void test1_4(TestObject testObject){
        testObject.i = 2;
    }

    private void test1_5(TestObject testObject){
        testObject.is = "2";
    }

    private void test1_6(final TestObject testObject){
        testObject.is = "2";
    }

    private void test1_7(final TestObject testObject){
        //testObject = new TestObject();
    }

}

class TestObject{
    int i;
    String is;
}
