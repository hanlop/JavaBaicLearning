package com.exercise.demo3;

public class Test {
    public static void main(String[] args) {
        Bus b=new Bus();
        Taxi t=new Taxi();
        Cinema c=new Cinema();

        b.charge();
        t.charge();
        c.charge();
        c.play();
    }
}
