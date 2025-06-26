package com.oracle;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        Date d1=new Date();
        System.out.println(d1);

        Date d2=new Date(1000);
        System.out.println(d2);

        Date d3=new Date(1000*60*60*24*4);
        System.out.println(d3);
    }
}
