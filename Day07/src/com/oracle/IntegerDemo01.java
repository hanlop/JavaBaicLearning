package com.oracle;

public class IntegerDemo01 {
    public static void main(String[] args) {
        Integer i1=new Integer(100);
        Integer i2=new Integer("100");
        System.out.println(i1+","+i2);

        Integer i3=Integer.valueOf(100);
        Integer i4=Integer.valueOf("100");
        System.out.println(i3+","+i4);
    }
}
