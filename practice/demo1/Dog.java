package com.oracle.practice.demo1;

public class Dog extends Animal{
    @Override
    public void play() {
        System.out.println("eat bone");
    }

    public void guard()
    {
        System.out.println("守家");
    }
}
