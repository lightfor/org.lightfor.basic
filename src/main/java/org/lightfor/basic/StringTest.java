package org.lightfor.basic;

/**
 * String basic knowledge
 * Created by Light on 2017/5/22.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "a" + "b" + "c" + "d";
        System.out.println(s);

        for(int i = 0 ; i < 5 ; i++){
            s += i;
            System.out.println(s.hashCode());
            System.out.println(s);
        }
    }
}
