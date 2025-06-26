package gui_demo;

import javax.swing.*;

public class LogIn {
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

        jf.setVisible(true);
    }
}
