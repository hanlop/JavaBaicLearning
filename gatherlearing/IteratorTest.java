package com.oracle.gatherlearing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<String>();
        collection.add("a");
        collection.add("ab");
        collection.add("abc");

        for (String s : collection) {
            System.out.println(s);
        }

        Iterator<String> it=collection.iterator();
        while(it.hasNext())
        {
            String s=it.next();
            System.out.println(s);
        }

        //Collection<int>
    }
}
