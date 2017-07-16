package org.lightfor.basic;

import org.junit.Test;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String basic knowledge
 * Created by Light on 2017/5/22.
 */
public class StringTest {
    @Test
    public void test1() {
        String s = "a" + "b" + "c" + "d";
        System.out.println(s);

        for(int i = 0 ; i < 5 ; i++){
            s += i;
            System.out.println(s.hashCode());
            System.out.println(s);
        }
    }

    @Test
    public void test2() {
        Date current = new Date();
        System.out.println(String.format(" %1$d  %2$d ", current.getTime() - 5 * 60 * 1000, current.getTime()));
    }

    @Test
    public void test3(){
        String ss = "";
        Pattern p = Pattern.compile("=\\[([|\u4E00-\u9FA5\\w\\.;]+)\\]");
        Matcher matcher = p.matcher(ss);

        if (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }


    @Test
    public void test4(){
        String str = "lookup(#3,2)";
        System.out.println(str.substring(str.indexOf(",")+1, str.indexOf(")")));
    }
}
