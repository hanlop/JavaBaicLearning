package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatRoom {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        //设置窗体大小
        jf.setSize(400,300);
        //设置窗体标题
        jf.setTitle("聊天室");
        //设置窗体居中
        jf.setLocationRelativeTo(null);
        //设置关闭窗体 结束程序
        jf.setDefaultCloseOperation(3);
        //设置窗体始终置顶
        jf.setAlwaysOnTop(true);
        //取消船体默认布局
        jf.setLayout(null);


        //添加文本域
        JTextArea messageArea=new JTextArea();
        messageArea.setBounds(10,10,360,200);
        jf.add(messageArea);

        //添加文本框
        JTextField message=new JTextField();
        message.setBounds(10,230,180,20);
        jf.add(message);

        //添加按钮
        JButton send=new JButton("发送");
        send.setBounds(200,230,70,20);
        jf.add(send);

        JButton btn=new JButton("清空聊天");
        btn.setBounds(280,230,100,20);
        jf.add(btn);


        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //接收文本框的内容
                String mess=message.getText().trim();
                if(mess.isEmpty())
                {
                    JOptionPane.showMessageDialog(jf,"不能输入为空");
                    return;
                }

                message.setText("");
                messageArea.append(mess+"\n");

            }
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageArea.setText("");
            }
        });

        //设置窗体可见
        jf.setVisible(true);
    }
}
