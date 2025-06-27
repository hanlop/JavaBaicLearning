package com.oracle;

public class MaxDemo01 {
    public static void main(String[] args) {
        int[] arr={12,32,13,49,21};

        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        System.out.println(max);
    }
}
