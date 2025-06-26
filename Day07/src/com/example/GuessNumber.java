package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        //设置窗体大小
        jf.setSize(400,300);
        //设置窗体标题
        jf.setTitle("猜数字");
        //设置窗体居中
        jf.setLocationRelativeTo(null);
        //设置关闭窗体 结束程序
        jf.setDefaultCloseOperation(3);
        //设置窗体始终置顶
        jf.setAlwaysOnTop(true);

        //取消窗体的默认布局
        jf.setLayout(null);

        //添加文本
        JLabel text=new JLabel("系统产生了一个1-100之间的数据,请你猜一猜");
        text.setBounds(70,50,350,20);
        jf.add(text);

        //添加文本框
        JTextField answer=new JTextField();
        answer.setBounds(120,100,150,20);
        jf.add(answer);

        //添加按钮
        JButton btn=new JButton("我猜");
        btn.setBounds(150,150,100,20);
        jf.add(btn);

        Random r=new Random();
        int number=r.nextInt(100)+1;

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //判断是否为空
                String messageString=answer.getText().trim();
                if(messageString.isEmpty())
                {
                    JOptionPane.showMessageDialog(jf,"输入错误,不能为空");
                    return;
                }

                //比较数字大小
                int guessNumber=Integer.parseInt(messageString);
                if(guessNumber>number)
                {
                    JOptionPane.showMessageDialog(jf,"你猜大了");
                    answer.setText("");
                }
                else if(guessNumber<number)
                {
                    JOptionPane.showMessageDialog(jf,"你猜小了");
                    answer.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(jf,"恭喜你猜对了");
                }
            }
        });

        //设置窗体可见
        jf.setVisible(true);
    }
}
