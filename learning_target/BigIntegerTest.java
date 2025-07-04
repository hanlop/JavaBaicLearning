package com.oracle.learning_target;

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bigInteger1=new BigInteger("13214124124124124124124124");
        BigInteger bigInteger2=new BigInteger("13214124124124124124124124");

        BigInteger bigInteger3 = bigInteger1.add(bigInteger2);
        System.out.println(bigInteger3);
    }
}
