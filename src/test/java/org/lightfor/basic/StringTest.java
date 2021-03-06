package org.lightfor.basic;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
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

    @Test
    public void test5(){
        System.out.println("\b");
        System.out.println("\t");
        System.out.println("\n");
        System.out.println("\"");
        System.out.println("\'");
        System.out.println("\\");
    }

    @Test
    public void test6(){
        final String a = "1";
        String b = a.concat("a");
        String c = a + "a";
        String d = "1a";
        String e = "1" + "a";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(b == c);
        System.out.println(b == d);
        System.out.println(c == d);
        System.out.println(e == d);
    }

    @Test
    public void test7() {
        System.out.println("a".split("b"));
    }

    @Test
    public void test8() {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000 ; i++){
            String s = "1 2 3 4".replaceAll(" ", "");
            //System.out.println(s);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test9() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            StringTokenizer st = new StringTokenizer("1 2 3 4", " ");
            String s = "";
            while(st.hasMoreTokens()){
                s = s+st.nextToken();
            }
            //System.out.println(s);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test10() {
        Date date = new Date();
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000 ; i++) {
            String.format("%tY", date);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test11() {
        Date date = new Date();
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000 ; i++) {
            new SimpleDateFormat("yyyy").format(date);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test12() {
        Date date = new Date();
        long start = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        for(int i = 0; i < 100000 ; i++) {
            simpleDateFormat.format(date);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void test13() {
        int i = 17;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));
    }


    @Test
    public void test14() throws UnsupportedEncodingException {
        String s = "测试";
        byte[] utf8 = s.getBytes("UTF-8");
        byte[] gbk = s.getBytes("GBK");
        System.out.println(new String(utf8,"UTF-8"));
        System.out.println(new String(utf8,"GBK"));
        System.out.println(new String(gbk,"UTF-8"));
        System.out.println(new String(gbk,"GBK"));
    }

    @Test
    public void test15() {
        System.out.println(Character.isLetter('章'));
    }

    @Test
    //238
    public void test16() {
        long start = System.currentTimeMillis();
        String s = "";
        for(int i = 0 ; i < 10000; i++) {
            s += i;
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    //2
    public void test17() {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i < 10000; i++) {
            s.append(i);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
