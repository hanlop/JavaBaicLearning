package com.oracle;

import java.util.Scanner;

public class Demo06 {
    //判断奇偶数
    public static void main(String[] args) {
        System.out.println("输入要判断奇偶的数字");
        int num=new Scanner(System.in).nextInt();

        if(num%2==0)
        {
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
