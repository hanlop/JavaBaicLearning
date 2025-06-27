package com.oracle;

import java.util.Scanner;

public class ArryDemo02 {
    public static void main(String[] args) {
        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("请输入数组中第"+(i+1)+"的数据元素:");
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextInt();
        }

        System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            {
                System.out.print(arr[i]);
            }
            else
            {
                System.out.print(arr[i]+", ");
            }

        }
        System.out.println("]");
    }
}
