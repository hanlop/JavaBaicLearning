package com.oracle.learning_target2;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr=new int[10];

        Random random=new Random();

        for (int i = 0; i < 10; i++) {
            arr[i]=random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);//Arrays是一个工具类
        System.out.println(Arrays.toString(arr));
    }
}
