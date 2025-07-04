package com.oracle.practice.practice3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name=sc.nextLine();
        System.out.println("请输入年龄:");
        String age=sc.nextLine();
        System.out.println("请输入身高:");
        String height=sc.nextLine();
        System.out.println("是否结婚:");
        String martial=sc.nextLine();
        System.out.println("请输入性别:");
        String gender=sc.nextLine();

        Student student=new Student(name,Integer.parseInt(age),Double.parseDouble(height),Boolean.parseBoolean(martial),
                gender.charAt(0));

        System.out.println("student: "+student);
    }
}
