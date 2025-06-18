package com.oracle;

import java.util.Scanner;

public class Demo02 {
    //获取较大值
    public static void main(String[] args) {
        int num1=new Scanner(System.in).nextInt();
        int num2=new Scanner(System.in).nextInt();

        System.out.println(getMax(num1,num2));
    }

    public static int getMax(int num1,int num2){
        int max=0;
        if(num1>num2)
        {
            max=num1;
        }
        else
        {
            max=num2;
        }

        return max;
    }
}
