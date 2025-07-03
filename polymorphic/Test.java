package com.oracle.polymorphic;

public class Test {
    public static void main(String[] args) {
        Cat c=new Cat();
        useAnimal(c);

        System.out.println("-----------------------");

        Dog d=new Dog();
        useAnimal(d);

        System.out.println("-----------------------");

        Pig p=new Pig();
        useAnimal(p);
    }

    public static void useAnimal(Animal animal)
    {
        animal.eat();

        if(animal instanceof Cat)
        {
            Cat c=(Cat)animal;
            c.catchMouse();
        }
        else if(animal instanceof Dog)
        {
            Dog d=(Dog)animal;
            d.guard();
        }
        else if(animal instanceof Pig)
        {
            Pig p=(Pig)animal;
            p.sleep();
        }
    }
}
