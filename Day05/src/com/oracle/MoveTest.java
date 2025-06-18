package com.oracle;

public class MoveTest {
    public static void main(String[] args) {
        Move m1=new Move();
        m1.setName("开心");
        m1.setType("喜剧");
        m1.setDirector("韩小新");

        System.out.println(m1.getName()+","+m1.getDirector()+","+m1.getType());

        Move m2=new Move("战狼","战争片","吴京");


        System.out.println(m2.getName()+","+m2.getDirector()+","+m2.getType());
    }
}
