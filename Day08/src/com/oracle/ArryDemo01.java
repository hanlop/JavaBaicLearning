package com.oracle;

import java.util.Random;

public class ArryDemo01 {
    public static void main(String[] args) {
        int[] arr={20,23,31,38,23,53};

        Random r=new Random();
        for(int i=0;i<arr.length;i++)
        {
            int index=r.nextInt(arr.length);

            int temp=0;
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
