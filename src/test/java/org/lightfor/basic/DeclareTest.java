package org.lightfor.basic;

import org.junit.Test;

/**
 * declare test
 * Created by Light on 2017/8/18.
 */
public class DeclareTest {

    public void test(){
        int _a;
        int $a;
        //error, number start
        //int 1a;


        //error, keywords
        //int void;



    }

    public void test1(){
        class A {
            void a(){

            }

            //error, same method name and parameter signature（number, order and type）
            //ambiguous when call a();
/*            int a(){

            }*/

            void a(int i, float f){

            }

            void a(float f, int i){

            }

            void a(int i){

            }

            void a(float f){

            }
        }
        A a = new A();
        a.a(9.0f,5);
        //error, ambiguous
        //a.a(9,5);
        a.a(9);

    }


    @Test
    public void test2() {
        class A {
            private void run() {
                System.out.println("A");
            }
        }

        class B extends A {
            //error , can't override private methods
            //@Override
            private void run () {
                System.out.println("B");
            }

            //error, inner classes can't have static
            //static void test() {
            //}
        }

        B b = new B();
        b.run();
        A a = new B();
        a.run();

        AA.run();
        BB.run();
    }
}

class AA {
    static void run(){
        System.out.println("A");
    }
}

class BB extends AA {
    //error, can't override static methods
    //@Override
    static void run() {
        System.out.println("B");
    }
}