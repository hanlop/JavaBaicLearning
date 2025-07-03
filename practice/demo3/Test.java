package com.oracle.practice.demo3;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("刘友强","男",20);
        Student student2=new Student("刘友强","男",20);
        System.out.println(student);
        System.out.println(student.equals(student2));
    }
}
