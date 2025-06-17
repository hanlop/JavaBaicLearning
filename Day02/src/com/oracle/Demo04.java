package com.oracle;

public class Demo04 {
    public static void main(String[] args) {
        short s=1;
        //short m=s+1;报错
        short m=(short)(s+1);

        short ss=1;
        ss+=1;
        //不报错 扩展赋值运算符 默认包括了强转
    }
}
