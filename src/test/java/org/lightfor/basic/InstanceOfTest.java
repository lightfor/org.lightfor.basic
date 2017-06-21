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
        System.out.println(null instanceof String);

        System.out.println(new HashMap<String, String>() instanceof Map);

        //AOP proxy class instanceof target class false
    }
}
