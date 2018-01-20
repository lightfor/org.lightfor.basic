package org.lightfor.basic;

import org.junit.Test;

public class FinalizeTest {

    @Test
    public void test() {
        class Test {
            String s;

            Test(String s) {
                this.s = s;
            }

            //prevent to use it, unreliable
            @Override
            protected void finalize() {
                System.out.println(s);
            }
        }

        for(int i = 0 ; i < 10 ; i++){
            new Test("a"+i);
        }
        Test a = new Test("a");
        Test b = new Test("b");
        Test c = new Test("c");
        System.gc();
        System.out.println(c);
    }
}
