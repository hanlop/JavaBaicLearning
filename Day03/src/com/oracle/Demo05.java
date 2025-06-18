package com.oracle;

public class Demo05 {
    //使用while 进行求和操作
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<=100)
        {
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
