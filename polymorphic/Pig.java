package com.oracle.polymorphic;

public class Pig extends Animal{
    @Override
    public void eat() {
        System.out.println("猪拱白菜");
    }

    public void sleep()
    {
        System.out.println("猪睡觉");
    }

}
