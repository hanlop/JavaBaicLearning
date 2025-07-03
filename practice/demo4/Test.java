package com.oracle.practice.demo4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();//生日日期
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date birthday=simpleDateFormat.parse(s);

        Date date=new Date();//当前日期
        System.out.println(date.getTime());

        if(birthday.getTime()- date.getTime()<0)
        {
                long time=date.getTime()- birthday.getTime();//计算现在的时间 和 生日相差多少豪秒
                long day=time/(1000*60*60*24);
            System.out.println("你已经来到这个世界上:"+day+"天");
        }
        else
        {
            System.out.println("生日必须早于当前日期");
        }

    }
}
