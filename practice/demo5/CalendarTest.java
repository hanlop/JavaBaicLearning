package com.oracle.practice.demo5;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();

        System.out.println("年:"+calendar.get(Calendar.YEAR)+"月:"+calendar.get(Calendar.MONTH)
        +"日:"+calendar.get(Calendar.DAY_OF_MONTH)+"时:"+calendar.get(Calendar.HOUR)+"分:"+
                calendar.get(Calendar.MINUTE)+"秒:"+calendar.get(Calendar.SECOND)+"星期:"+calendar.get(Calendar.DAY_OF_WEEK));
    }
}
