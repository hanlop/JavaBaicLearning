package com.oracle.learning_practice.practice6;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("张三","男",20);
        Student s2=new Student("李四","女",21);
        Student s3=new Student("张三","男",20);

        Set<Student> set=new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        for (Student student : set) {
            System.out.println(student);
        }
    }
}
