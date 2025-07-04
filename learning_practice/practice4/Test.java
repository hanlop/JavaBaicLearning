package com.oracle.learning_practice.practice4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("韩在",18,"男");
        Student s2=new Student("韩在啊",11,"男");
        Student s3=new Student("韩的在",20,"男");

        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        findMaxAge(arrayList);

        for (Student student : arrayList) {
            System.out.println(student);
        }
    }

    public static void findMaxAge(ArrayList<Student> arrayList)
    {
        //存储年龄最大的索引
        int max=0;
        for (int i = 0; i < arrayList.size()-1; i++) {
            if(arrayList.get(i+1).getAge()>arrayList.get(i).getAge())
            {
                max=i+1;
            }
        }
        arrayList.get(max).setName("小猪佩奇");
    }
}
