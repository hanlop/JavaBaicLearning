package com.oracle;

public class Demo05 {
    //方法重载

    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20.5));
        System.out.println(sum(10,20,30));
    }

    public static int sum(int a,int b)
    {
        return a+b;
    }

    public static double sum(int a,double b)
    {
        return a+b;
    }

    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }

}
