package com.oracle.practice.demo1;

public class Cat extends Animal{
    @Override
    public void play() {
        System.out.println("eat fish");
    }

    public void catchMouse()
    {
        System.out.println("抓老鼠");
    }
}
