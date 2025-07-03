package com.oracle.practice.demo1;

public class Test {
    public static void main(String[] args) {
        Cat c=new Cat();
        Dog d=new Dog();

        method(c);
        method(d);
    }

    public static void method(Animal animal)
    {
        animal.play();

        if(animal instanceof Cat)
        {
            ((Cat)animal).catchMouse();
        }
        else if(animal instanceof Dog)
        {
            ((Dog)animal).guard();
        }
    }
}
