package com.oracle.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class PracticeDemo1 {
    public static void main(String[] args) {
        double[]  arr={0.1,0.2,2.1,3.2,5.56,7.21};

        BigDecimal result=new BigDecimal("0.0");

        for (int i = 0; i < arr.length; i++) {
            BigDecimal bigDecimal=new BigDecimal(String.valueOf(arr[i]));
            result= result.add(bigDecimal);
        }

        System.out.println(result);

        BigDecimal len=new BigDecimal(arr.length);

        BigDecimal avg= new BigDecimal("0.0");
        avg=result.divide(len,2, RoundingMode.HALF_UP);




        System.out.println(avg);
    }
}
