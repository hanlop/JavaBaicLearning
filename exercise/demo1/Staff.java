package com.exercise.demo1;

public abstract class Staff {
    private String name;
    private String gender;
    private int age;

    public Staff()
    {

    }

    public Staff(String name,String sex,int age)
    {
        this.name=name;
        this.gender =sex;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void work();
}
