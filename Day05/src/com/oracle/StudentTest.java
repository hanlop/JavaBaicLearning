package com.oracle;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=18;
        s1.name="吴彦祖";

        System.out.println(s1.name+s1.age);
        s1.study();

        System.out.println("--------------------------");

        Student s2=new Student();
        s2.name="虎大王";
        s2.age=12;

        s2.study();
    }
}
