package org.lightfor.basic;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionTest {


    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        for (String str : list) {
            if ("3".equals(str)) {
                list.remove(str);
            }
        }
    }

    @Test(expected = ConcurrentModificationException.class)
    public void test2() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        for (String str : list) {
            if ("1".equals(str)) {
                list.remove(str);
            }
        }
    }

    @Test
    public void test3() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        for (String str : list) {
            if ("1".equals(str)) {
                list.remove(str);
            }
        }
    }

    @Test
    public void test4() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        list.removeIf("1"::equals);
    }

    @Test
    public void test5() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("1")) {
                iterator.remove();
            }
        }
    }

    @SuppressWarnings("unchecked")
    @Test
    public void test6(){
        Set set = new HashSet<>();
        set.add("1");

        test7(set);
        test8(set);
    }

    private void test7(Set<?> set){
        //error, type not match
        //set.add("1");
        System.out.println(set.size());
    }

    @SuppressWarnings("unchecked")
    private void test8(Set set){
        set.add("2");
        System.out.println(set.size());
    }
}
