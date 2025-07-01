package com.exercise.demo1;

public class UITeacher extends Staff implements Drawing{

    public UITeacher(String name,String sex,int age)
    {
        super(name,sex,age);
    }

    @Override
    public void drawing() {
        System.out.println(getName()+"讲画画");
    }

    @Override
    public void work() {
        System.out.println(getName()+"讲UI设计课");
    }
}
