package com.oracle.learning_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PracticeDemo5 {
    public static void main(String[] args) {
        Set<String> sanguo=new HashSet<>();
        sanguo.add("刘备");
        sanguo.add("关羽");
        sanguo.add("张飞");
        sanguo.add("刘备");
        sanguo.add("张飞");

        System.out.println(sanguo.size());
        System.out.println("----------------------------");

        Iterator<String> it=sanguo.iterator();
        while (it.hasNext()) {
            String next =  it.next();
            System.out.println(next);
        }

        System.out.println("-----------------------------");

        for (String s : sanguo) {
            System.out.println(s);
        }

    }
}
