package com.exercise.demo1;

public class Text {
    public static void main(String[] args) {
        JavaTeacher j=new JavaTeacher("小明","男",25);
        j.work();

        UITeacher uiTeacher=new UITeacher("小红","女",18);
        uiTeacher.drawing();
        uiTeacher.work();
    }
}
