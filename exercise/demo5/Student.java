package com.exercise.demo5;

public class Student {
    private String name;
    private int age;
    private Sex sex;

    public Student(String name,int age,Sex sex)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void show()
    {
        System.out.println("姓名:"+name+" "+"年龄:"+age+" "+"性别:"+sex);
    }
}
