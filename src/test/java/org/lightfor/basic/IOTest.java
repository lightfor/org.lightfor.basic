package org.lightfor.basic;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * @author Light
 * @date 2018-01-03
 */
public class IOTest {

    public static void main(String[] args) throws Exception {
        new IOTest().test7();
    }

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
        File file = new File(".");
        String path = file.getAbsolutePath();
        System.out.println(path);
        String[] list = file.list();
        if(list == null){
            return;
        }
        for(String innerFIleName : list){
            File innerFile = new File(innerFIleName);
            if(innerFile.isDirectory()){
                System.out.println(innerFIleName+"是目录");
            } else if(innerFile.isFile()){
                System.out.println(innerFIleName+"是文件");
            }
        }

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
        //append default value false\
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("out.txt", true);
            fileOutputStream.write("test中文".getBytes());
            fileOutputStream.write("\r\n".getBytes());
            fileOutputStream.write(String.valueOf(1).getBytes());
        } finally {
            if(fileOutputStream != null){
                fileOutputStream.close();
            }
        }
    }

    //can't input
    @Test
    public void test4() throws IOException {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q');
    }

    @Test
    public void test5() throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("end"));
    }

    //why scanner in java.util not java.io
    @Test
    public void test6() {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }

    public void test7() {
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: ");
    }

}
