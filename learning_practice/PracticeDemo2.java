package com.oracle.learning_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeDemo2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        method1(list);
        System.out.println("-----------------------");
        method2(list);
        System.out.println("-----------------------");
        method3(list);
    }

    public static void method1(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void method2(List<Integer> list)
    {
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()) {
            Integer next =  it.next();
            System.out.println(next);
        }
    }

    public static void method3(List<Integer> list)
    {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
