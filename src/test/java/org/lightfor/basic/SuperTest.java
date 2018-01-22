package org.lightfor.basic;

public class SuperTest {

    public void test() {
        class A {
            //no default constructor
            A(int i){

            }
        }

        class B extends A {
            B(){
                //need to call explicitly
                super(0);
            }
        }
    }
}
