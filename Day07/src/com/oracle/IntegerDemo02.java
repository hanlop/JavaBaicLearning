package com.oracle;

public class IntegerDemo02 {
    public static void main(String[] args) {
        int i=100;
        String s1=String.valueOf(100);
        System.out.println(s1);

        String s2="100";
        int i2=Integer.parseInt(s2);
        System.out.println(s2);

        System.out.println(i==i2);
    }
}
