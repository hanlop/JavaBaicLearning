package com.oracle;

public class CarTest {
    public static void main(String[] args) {
        Car c1=new Car();

        c1.setBrand("特斯拉");
        c1.setColor("黑色");
        c1.setPrice(2100000);

        System.out.println(c1.getBrand()+","+c1.getColor()+","+c1.getPrice());
    }
}
