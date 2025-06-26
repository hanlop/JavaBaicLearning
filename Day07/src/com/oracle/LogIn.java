package com.oracle;

import javax.swing.*;

public class LogIn extends JFrame{
        public LogIn()
        {
            //设置窗体初始话
            intFrame();

            //在窗体中添加容器
            addVessel();

            this.setVisible(true);
        }

        public void intFrame()
        {
            //设置窗体标题
            this.setTitle("用户登录");
            //设置窗体大小
            this.setSize(400,300);
            //设置窗体居中
            this.setLocationRelativeTo(null);
            //设置窗体关闭应用程序关闭
            this.setDefaultCloseOperation(3);
            //设置窗体始终在置顶部分
            this.setAlwaysOnTop(true);
            //取消窗体默认buju
            this.setLayout(null);
        }

        public void addVessel()
        {
            JLabel userName=new JLabel("用户名 ");
            userName.setBounds(50,50,50,20);
            this.add(userName);

            JTextField jTextField=new JTextField();
            jTextField.setBounds(150,50,180,20);
            this.add(jTextField);

            JLabel passWord=new JLabel("密码");
            passWord.setBounds(50,100,50,20);
            this.add(passWord);

            JPasswordField jPasswordField=new JPasswordField ();
            jPasswordField.setBounds(150,100,180,20);
            this.add(jPasswordField);

            JButton btn=new JButton("登录");
            btn.setBounds(50,200,280,20);
            this.add(btn);
        }
}
