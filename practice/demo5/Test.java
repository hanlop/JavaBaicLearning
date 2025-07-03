package com.oracle.practice.demo5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        String dateFormat=simpleDateFormat.format(date);

        System.out.println(dateFormat);
    }
}
