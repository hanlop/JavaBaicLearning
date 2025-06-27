package com.oracle;

import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int x=r.nextInt(arr.length);
                int y=r.nextInt(arr[x].length);

                int temp=arr[i][j];
                arr[i][j]=arr[x][y];
                arr[x][y]=temp;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
