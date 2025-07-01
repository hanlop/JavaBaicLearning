package com.exercise.demo2;

public class Circle implements ShapePara{
    public final static double PI=3.14;
    public double radius;

    public Circle(double radius)
    {
        this.radius=radius;
    }

    public static double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*getRadius()*getRadius();
    }

    @Override
    public double getCircumference() {
        return PI*2*getRadius();
    }
}
