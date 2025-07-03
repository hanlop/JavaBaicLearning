package com.oracle.polymorphic;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void guard()
    {
        System.out.println("狗看家");
    }

}
