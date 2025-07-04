package com.oracle.practice.practice3;

public class Student {
    private String name;
    private int age;
    private double height;
    private boolean marital;
    private char gender;

    public Student()
    {

    }

    public Student(String name, int age, double height, boolean marital, char gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.marital = marital;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarital() {
        return marital;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMarital(boolean marital) {
        this.marital = marital;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //重写转换字符
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", marital=" + marital +
                ", gender=" + gender +
                '}';
    }
}
