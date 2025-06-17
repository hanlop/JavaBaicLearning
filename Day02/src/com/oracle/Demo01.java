package com.oracle;

import org.w3c.dom.ls.LSOutput;

public class Demo01 {
    //数值拆分案例
    public static void main(String[] args) {
        int num=456;
        num=980;
        int units=num%10;
        int tens=num/10%10;
        int hundreds=num/100;



        System.out.println("整数: "+num);
        System.out.println("个位: "+units);
        System.out.println("十位: "+tens);
        System.out.println("百位: "+hundreds);
    }
}
