package com.oracle.learning_target;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal1=new BigDecimal("0.1");
        BigDecimal bigDecimal2=new BigDecimal("0.3");
        //会报异常 ArithmeticException 算术异常 原因时除不尽
        //BigDecimal result=bigDecimal1.divide(bigDecimal2);

        BigDecimal result=bigDecimal1.divide(bigDecimal2,3,BigDecimal.ROUND_HALF_UP);
        System.out.println(result);

    }
}
