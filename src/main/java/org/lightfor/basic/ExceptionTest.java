package org.lightfor.basic;

/**
 * Exception Test
 * Created by Light on 2017/6/17.
 */
public class ExceptionTest {

    public static void main(String[] args) {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
