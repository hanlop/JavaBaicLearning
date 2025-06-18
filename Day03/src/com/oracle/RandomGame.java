package com.oracle;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        System.out.println("请猜数字 范围在1~100 输入0 退出游戏");

        //生成随机数
        Random r= new Random();
        int answer=r.nextInt(100)+1;

        do {
            int num=new Scanner(System.in).nextInt();

            if(num==0){
                break;
            }else if (num>answer) {
                System.out.println("猜大了");
            }else if(num<answer){
                System.out.println("猜小了");
            }else
            {
                System.out.println("恭喜你 猜对了");
                break;
            }
        }while(true);
    }
}
