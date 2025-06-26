package com.oracle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateDemo01 {
    public static void main(String[] args) throws ParseException {
        Date d1=new Date();

        SimpleDateFormat sdf=new SimpleDateFormat();
        System.out.println(sdf.format(d1));

        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf1.format(d1));

        String s1="2025年06月15日 08:48:46";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d2=sdf2.parse(s1);
        System.out.println(d2);

    }
}
