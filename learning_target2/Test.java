package com.oracle.learning_target2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Student> a1=new ArrayList<>();
        ArrayList<JavaStudent> a2=new ArrayList<>();
        ArrayList<UIStudent> a3=new ArrayList<>();

        ArrayList<Teacher> a4=new ArrayList<>();
        ArrayList<JavaTeacher> a5=new ArrayList<>();
        ArrayList<UITeacher> a6=new ArrayList<>();

        ArrayList<Person> a7=new ArrayList<>();

        method(a1);
        method1(a2);
        method2(a1);

    }

    public static void method(ArrayList<?> list)
    {

    }

    public static void method1(ArrayList<? extends Student> list)
    {

    }

    public static void method2(ArrayList<? super Student> list)
    {

    }
}
