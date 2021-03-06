package org.lightfor.basic;

import org.junit.Test;

/**
 * inheritance test
 * Created by Light on 2017/8/27.
 */
public class InheritanceTest {

    @Test
    public void test() {
        A a = new A();
        B b = new B();
        b.out();
        b.outA();
        b.outB();
        b.outDefault();

        test1(a);
        test1(b);

        IC ic = new IC(){
            @Override
            public void a() {

            }

            @Override
            public void a(int i) {

            }

            @Override
            public void b() {

            }
        };

        //error
        //System.out.println(IC.I);
        System.out.println(IA.I);
    }

    public void test1(A a) {
        a.out();
    }


    class A {
        void out() {
            System.out.println("1");
        }
    }

    class B extends A {
        B() {
            //error, super() must be first statement
            //System.out.println("1");
            super();
        }

        @Override
        void out() {
            System.out.println("2");
        }

        void outA() {
            super.out();
        }

        void outB() {
            this.out();
        }

        void outDefault() {
            out();
        }
    }

    class C extends B {
        @Override
        void out() {
            //error
            //super.super.out();
        }
    }

    interface IA {
        void a();

        void b();

        int I = 1;
    }

    interface IB{
        void a();

        //int a();

        void a(int i);

        int I = 2;
    }

    interface IC extends IA, IB{
    }


    @Test
    public void test1(){
        class A {
            int i=1;

            private int j = 1;
            void a(){
                System.out.println("A");
            }
        }

        class B extends A {
            int i=2;

            private String j = "2";
            void a() {
                System.out.println("B");
            }
        }

        A a = new A();
        A b = new B();
        a.a();
        b.a();
        System.out.println(a.i);
        System.out.println(b.i);
        System.out.println(((B) b).i);

        System.out.println(a.j);
        System.out.println(b.j);
        System.out.println(((B) b).j);
    }

}
