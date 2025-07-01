package com.exercise.demo3;

public class Taxi implements Charge{
    @Override
    public void charge() {
        System.out.println("1.6元/公里，起价3公里。");
    }
}
