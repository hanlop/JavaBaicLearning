package com.oracle.learning_practice;

import java.util.LinkedHashSet;

public class Practice7 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(50);
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        linkedHashSet.add(20);

        System.out.println(linkedHashSet.size());

        for (Integer integer : linkedHashSet) {
            if(integer>25)
            {
                System.out.println(integer);
            }
        }
    }
}
