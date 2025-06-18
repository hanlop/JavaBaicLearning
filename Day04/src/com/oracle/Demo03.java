package com.oracle;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        int num1=new Scanner(System.in).nextInt();
        int num2=new Scanner(System.in).nextInt();
        int num3=new Scanner(System.in).nextInt();

        System.out.println("中间数是: "+getMediant(num1,num2,num3));
    }

    public static int getMediant(int num1,int num2,int num3){
        int mediant=0;
        if(num1>num2){
            if(num2>num3){
                mediant=num2;
            }else{
                mediant=num3;
            }
        }else if(num1<num2){
            if(num1>num3){
                mediant=num1;
            }else{
                mediant=num3;
            }
        }else{
            mediant=num1;
        }

        return mediant;
    }
}
