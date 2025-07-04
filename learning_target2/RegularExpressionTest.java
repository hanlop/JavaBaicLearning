package com.oracle.learning_target2;

public class RegularExpressionTest {
    public static void main(String[] args) {
        System.out.println("had".matches("h[a-z]d"));
        System.out.println("had".matches("h[a-z&&[^a]]d"));


    }
}
