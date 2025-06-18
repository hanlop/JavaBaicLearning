package com.oracle;

public class Demo03 {
    //水仙花数案例
    public static void main(String[] args) {
        System.out.println("下面是所有的水仙花数:");
        for(int i=100;i<1000;i++)
        {
            int units=i%10;
            int tens=i/10%10;
            int hundreds=i/100%10;

            if((units*units*units)+(tens*tens*tens)+(hundreds*hundreds*hundreds)==i)
            {
                System.out.println(i);
            }
        }
    }
}
