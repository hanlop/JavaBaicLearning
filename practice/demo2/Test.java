package com.oracle.practice.demo2;

public class Test {
    public static void main(String[] args) {
            Manager m=new Manager(9000,"张小强");
            Programmer p=new Programmer(5000,"李小亮");
            Company c=new Company(1000000);

            sendSalary(m,c);
        System.out.println("--------------------------------");
            sendSalary(p,c);

    }

    public static void sendSalary(Employee e,Company c)
    {
        c.play(e);
        System.out.println("给"+e.getName()+"发工资:"+e.getSalary()+",公司剩余:"+c.getTotalFund());
    }
}
