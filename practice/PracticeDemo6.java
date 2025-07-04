package com.oracle.practice;

import java.util.ArrayList;
import java.util.Collection;

public class PracticeDemo6 {
    public static void main(String[] args) {
        Collection<Double> collection=new ArrayList<Double>();
        collection.add(88.5);
        collection.add(39.2);
        collection.add(77.1);
        collection.add(56.8);
        collection.add(89.0);
        collection.add(99.0);
        collection.add(59.5);


        Method1(collection);
        System.out.println("----------------------");
        Method2(collection);
        System.out.println("----------------------");
        Method3(collection);
        System.out.println("----------------------");
        Method4(collection);


    }

    public static void Method1(Collection<Double> c)
    {
        for (Double aDouble : c) {
            System.out.println(aDouble);
        }
    }

    public static void Method2(Collection<Double> c)
    {
        for (Double aDouble : c) {
            if(aDouble<60.0)
            {
                System.out.println(aDouble);
            }
        }
    }

    public static void Method3(Collection<Double> c)
    {
        int count=0;
        Double total=0.0;
        for (Double aDouble : c) {
            total+=aDouble;
            if(aDouble<60.0)
            {
                count++;
            }
        }

        System.out.println("不及格分数数量:"+count+" 平均分:"+total/c.size());
    }

    public static void Method4(Collection<Double> c)
    {
        Double max=0.0;
        for (Double aDouble : c) {
            if(max<aDouble)
            {
                max=aDouble;
            }
        }
        System.out.println("最高分数:"+max);
    }
}
