package com.oracle;

import java.util.Scanner;

public class Demo07 {
    //swtich语句用法
    public static void main(String[] args) {
        int month=new Scanner(System.in).nextInt();

        switch(month){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("春季");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
