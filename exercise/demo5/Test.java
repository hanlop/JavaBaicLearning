package com.exercise.demo5;

public class Test {
    public static void main(String[] args) {
        Student s=new Student("小明",18,Sex.Boy);
        Student s1=new Student("小红",19,Sex.Girl);

        s.show();
        s1.show();
    }
}
