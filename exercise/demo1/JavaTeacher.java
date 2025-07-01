package com.exercise.demo1;

public class JavaTeacher extends Staff{
    public JavaTeacher(String name,String sex,int age)
    {
        super(name,sex,age);
    }
    @Override
    public void work() {
        System.out.println(getName()+"讲Java课");
    }
}
