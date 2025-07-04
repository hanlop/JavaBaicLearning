package com.oracle.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PracticeDemo5 {
    public static void main(String[] args) {

        Collection<String> collection=new ArrayList<String>();
        collection.add("JavaEE企业级开发指南");
        collection.add("Oracle高级编程");
        collection.add("MySQL从入门到精通");
        collection.add("Java架构师之路");

        //遍历集合中的每一个元素
        Iterator<String> it=collection.iterator();
/*        while (it.hasNext()) {
            String next =  it.next();
            System.out.println(next);
        }*/

        //筛选书名小于10的字符       
/*        while (it.hasNext()) {
            String next =  it.next();
            if(next.length()<10)
            {
                System.out.println(next);
            }
        }*/

        //含有Java的打印
/*        while (it.hasNext()) {
            String next =  it.next();
            if(next.contains("Java"))
            {
                System.out.println(next);
            }
        }*/


        //删除含有Oracle字符的内容
        while (it.hasNext()) {
            String next =  it.next();
            if(next.contains("Oracle"))
            {
                it.remove();
            }
            else
            {
                System.out.println(next);
            }

        }

    }
}
