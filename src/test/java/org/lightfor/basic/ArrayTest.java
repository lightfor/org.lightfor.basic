package org.lightfor.basic;

import org.junit.Test;

public class ArrayTest {

    @Test
    public void test() {
        int length = 1024 * 1024 * 2;
        int[] arr = new int[length];
        for(int i = 0; i <length; i++){
            arr[i] = i;
        }
        long usedMB = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println(usedMB);
    }

    @Test
    public void test1() {
        int length = 1024 * 1024;
        int[][] arr = new int[length][2];
        for(int i = 0; i <length; i++){
            arr[i][0] = i * 2;
            arr[i][1] = i * 2 + 1;
        }
        long usedMB = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        System.out.println(usedMB);
    }
}
