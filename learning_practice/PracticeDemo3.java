package com.oracle.learning_practice;

import java.util.ArrayList;

public class PracticeDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println(listTest(arrayList,30));
        System.out.println(listTest(arrayList,50));


    }

    public static int listTest(ArrayList<Integer> list, Integer num)
    {
        //用index记录索引
        int index=0;
        for (Integer integer : list) {
            if(integer.equals(num))
            {
                //找到相等的返回当前索引
                return index;
            }
            index++;
        }

        //找不到返回-1
        return -1;
    }

}
