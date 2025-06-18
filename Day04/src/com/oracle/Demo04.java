package com.oracle;
import java.util.Scanner;

public class Demo04 {
    //打印[1,n]之间的所有奇数
    public static void main(String[] args) {

        int num=new Scanner(System.in).nextInt();
        printOddnumber(num);
    }

    public static void printOddnumber(int n){
        if(n<1)
        {
            System.out.println("输入错误");
            return;
        }

        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
