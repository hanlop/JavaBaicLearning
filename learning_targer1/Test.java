package com.oracle.learning_targer1;

public class Test {
    public static void main(String[] args) {
        GenericityTest<String> s=new GenericityTest<>();
        s.setTest("韩正新");

        GenericityIn<Integer> i=new GenericityIn<>();
        i.print(12);
    }

}
