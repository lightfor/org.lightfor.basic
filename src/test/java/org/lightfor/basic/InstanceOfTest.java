package org.lightfor.basic;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * instanceof Test
 * Created by Light on 2017/6/21.
 */
public class InstanceOfTest {

    @Test
    public void test(){
        //null instanceof other
        System.out.println(null instanceof String);

        // error, instanceof null
        //System.out.println(new HashMap<String,String>() instanceof null);
    }

    @Test
    public void test1(){
        //instance of a interface
        System.out.println(new HashMap<String, String>() instanceof Map);
    }

    @Test
    public void test2(){
        // subclass instance of superclass
        System.out.println(new Integer(1) instanceof Number);
    }

    public void test3(){
        //AOP proxy class instanceof target class false
    }
}
