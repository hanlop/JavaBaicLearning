package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf=new JFrame();
        //设置窗体标题
        jf.setTitle("用户登录");
        //设置窗体大小
        jf.setSize(400,300);
        //设置窗体居中
        jf.setLocationRelativeTo(null);
        //设置窗体关闭应用程序关闭
        jf.setDefaultCloseOperation(3);
        //设置窗体始终在置顶部分
        jf.setAlwaysOnTop(true);
        //取消窗体默认buju
        jf.setLayout(null);

        JLabel userName=new JLabel("用户名 ");
        userName.setBounds(50,50,50,20);
        jf.add(userName);

        JTextField jTextField=new JTextField();
        jTextField.setBounds(150,50,180,20);
        jf.add(jTextField);

        JLabel passWord=new JLabel("密码");
        passWord.setBounds(50,100,50,20);
        jf.add(passWord);

        JPasswordField jPasswordField=new JPasswordField ();
        jPasswordField.setBounds(150,100,180,20);
        jf.add(jPasswordField);

        JButton btn=new JButton("登录");
        btn.setBounds(50,200,280,20);
        jf.add(btn);


        //设置用户名和密码
        String name="hanlop";
        String password="123456";

        //给按钮添加点击事件
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //接受从文本框输入的用户名和密码
                String userName=jTextField.getText().trim();
                String userPassword=jPasswordField.getText();

                //验证密码和用户名的长度
                if(userName.length()<6||userName.length()>12)
                {
                    JOptionPane.showMessageDialog(jf,"用户名和密码长度都是6-12位");
                    jTextField.setText("");
                    return;
                }

                if(userPassword.length()<6||userPassword.length()>12)
                {
                    JOptionPane.showMessageDialog(jf,"用户名和密码长度都是6-12位");
                    jPasswordField.setText("");
                    return;
                }

                //验证是否相等
                if(name.equals(userName)&&password.equals(userPassword))
                {
                    JOptionPane.showMessageDialog(jf,"登录成功");
                    jTextField.setText("");
                    jPasswordField.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(jf,"用户名或密码有误");
                }
            }
        });



        jf.setVisible(true);
    }
}
