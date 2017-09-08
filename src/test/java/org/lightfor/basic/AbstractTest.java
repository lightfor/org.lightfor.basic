package org.lightfor.basic;

public class AbstractTest {

    public void test1(){

        A a = new A(){};

    }

    abstract class A {
        //error, abstract method can't be private
        //abstract private void a();

    }

}


