package com.oracle;

public class StringDemo02 {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="abcd";
        String s3="Abcd";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1==s2);

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        String s4=" WSDASD";
        System.out.println(s4);
        System.out.println(s4.trim());
    }
}
