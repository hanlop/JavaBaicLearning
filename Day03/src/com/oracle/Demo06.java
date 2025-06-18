package com.oracle;

public class Demo06 {
    //案例珠峰折纸
    //珠峰高度 8848.86  纸张厚度0.1毫米

    public static void main(String[] args) {
        //单位是m
       double peakHeight=8848.86;
       //单位是mm
        double paperThickness=0.1;

        //对折次数
        int count=0;

        while((peakHeight*1000)>paperThickness)
        {
            paperThickness*=2;
            count++;
        }

        System.out.println(count);
    }
}
