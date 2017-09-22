package org.lightfor.basic;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    @Test
    public void test(){
        Map<String, String> map = new HashMap<>();
        map.put("A", "B");
        String key = new String("A");
        map.put(key, "C");
        System.out.println(map.get("A"));
    }

    @Test
    public void test1(){
        class A {
            String value;
            A(String value){
                this.value = value;
            }
        }
        Map<A, String> map = new HashMap<>();
        A a = new A("A");
        map.put(a, "B");
        A a1 = new A("A");
        map.put(a1, "C");
        System.out.println(map.get(a));
    }

    @Test
    public void test2(){
        class A {
            String value;
            A(String value){
                this.value = value;
            }

            @Override
            public boolean equals(Object var1) {
                return value.equals(((A)var1).value);
            }

            @Override
            public int hashCode() {
                return value.hashCode();
            }

        }
        Map<A, String> map = new HashMap<>();
        A a = new A("A");
        map.put(a, "B");
        A a1 = new A("A");
        map.put(a1, "D");
        System.out.println(map.get(a));
    }
}
