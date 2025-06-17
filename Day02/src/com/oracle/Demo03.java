package com.oracle;

public class Demo03 {
    //字符串的+代表的是连接符  而不是加号
    public static void main(String[] args) {
        //加号是从左往右依次计算的
        //可以使用括号提升算术优先级
        System.out.println("123"+"23123");
        System.out.println("5+5="+5+5);
        System.out.println("5+5="+(5+5));
    }
}
