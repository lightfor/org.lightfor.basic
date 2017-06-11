package org.lightfor.basic.constructor;

/**
 * 基类
 * Created by Light on 2017/6/10.
 */
public class A {
    String a;

    String b;
    A(String a){
        this.a = a;
    }

    A(String a, String b){
        this.a = a;
        this.b = b;
    }
}
