package org.lightfor.basic;

import org.junit.Test;

/**
 * loop statement test
 * Created by Light on 2017/8/27.
 */
public class LoopStatementTest {

    @Test
    public void test(){
        int i = 0;
        do {
            i++;
            System.out.println("1");
        } while (i < 3 ); // focus ";"
    }

    @Test
    public void test1() {
        a:
        //error, not before a loop
        //System.out.println("1");
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(i+"\t"+j);
                if(j == 4){
                    break a;
                }
            }
        }
        System.out.println("1");
    }
}
