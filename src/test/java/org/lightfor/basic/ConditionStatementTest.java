package org.lightfor.basic;

import org.junit.Test;

/**
 * condition statement test
 * Created by Light on 2017/8/26.
 */
public class ConditionStatementTest {

    @Test
    public void test(){
        long start = System.currentTimeMillis();
        for(int i = 0 ; i < 1000000000 ; i++){
            if(i == 300000000){
                System.out.println(1);
            } else if(i == 700000000){
                System.out.println(2);
            } else {
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }


    @Test
    //switch slower than if
    public void test1(){
        long start = System.currentTimeMillis();
        for(int i = 0 ; i < 1000000000 ; i++){
            switch (i){
                case 300000000:
                    System.out.println(1);
                    break;
                case 700000000:
                    System.out.println(2);
                    break;
                default:
                    break;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test2(){
        long start = System.currentTimeMillis();
        for(int i = 0 ; i < 1000000000 ; i++){
            if(i == 300000000){
                System.out.println(1);
            }
            if(i == 700000000){
                System.out.println(2);
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test3(){
        int i = 0;
        switch (i){
            default:
                System.out.println("d");
            case 1:
                System.out.println("1");
        }
    }

    @Test
    public void test4(){
        switch (1){
            case 1 :
                //continue;   error
                //break;      error
                System.out.println("1");
        }
    }
}
