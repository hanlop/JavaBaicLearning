package com.oracle;

public class OperatorDemo01 {
    //使用三元运算符 比较三个数中最大的值
    public static void main(String[] args) {
        int num1=50;
        int num2=20;
        int num3=30;

        System.out.println("数值1: "+num1);
        System.out.println("数值2: "+num2);
        System.out.println("数值3: "+num3);

        int max=(num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3;
        System.out.println("最大值是: "+max);
    }
}
