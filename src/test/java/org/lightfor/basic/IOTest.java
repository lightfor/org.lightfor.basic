package org.lightfor.basic;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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
        while (n != -1) {
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
}
