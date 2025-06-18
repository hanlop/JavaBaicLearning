package com.oracle;

public class Demo04 {
    //回文数案例
    public static void main(String[] args) {
        int count=0;
        for(int i=10000;i<100000;i++)
        {
            if(((i/10000)==(i%10))&&((i/1000%10)==(i/10%10)))
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("回文数个数: "+count);
    }
}
