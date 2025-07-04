package com.oracle.practice.practice4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入:姓名-年龄-身高");

        String str=sc.nextLine();

        String[] formation=str.split("-");

        Student stu=new Student(formation[0],Integer.parseInt(formation[1]),Double.parseDouble(formation[2]));

        System.out.println("姓名:"+stu.getName()+" 年龄:"+stu.getAge()+" 身高:"+stu.getHeight());
    }
}
