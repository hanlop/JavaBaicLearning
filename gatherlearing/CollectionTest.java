package com.oracle.gatherlearing;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<String>();
        collection.add("Java");
        collection.add("Mysql");
        collection.add("Mybatis");

        String[] strings=collection.toArray(new String[0]);

        for (int i = 0; i < 3; i++) {
            System.out.println(strings[i]);
        }
    }
}
