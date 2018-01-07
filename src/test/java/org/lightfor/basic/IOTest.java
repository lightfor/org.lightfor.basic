package org.lightfor.basic;

import org.junit.Test;

import java.io.*;

/**
 * @author Light
 * @date 2018-01-03
 */
public class IOTest {

    //中文
    @Test
    public void test() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/test/java/org/lightfor/basic/IOTest.java");
        byte[] data = new byte[1024];
        int i = 0;
        int n = fileInputStream.read();
        while (n != -1 & i < 1024) {
            data[i] = (byte) n;
            i++;
            n = fileInputStream.read();
        }
        String s = new String(data, 0, i, "UTF-8");
        //error charset
        //String s = new String(data, 0, i, "GBK");
        System.out.println(s);
    }


    //know absolute path
    @Test
    public void test1() {
        File file = new File("");
        System.out.println(file.getAbsolutePath());
    }


    @Test
    public void test2() throws IOException {
        FileReader fileReader = new FileReader("src/test/java/org/lightfor/basic/IOTest.java");
        char[] data = new char[1024];
        int i = fileReader.read(data);
        String s = new String(data, 0, i);
        System.out.println(s);
    }

    @Test
    public void test3() throws IOException {
        //append default value false
        FileOutputStream fileOutputStream = new FileOutputStream("out.txt", true);
        fileOutputStream.write("test中文".getBytes());
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write(String.valueOf(1).getBytes());
    }

}
