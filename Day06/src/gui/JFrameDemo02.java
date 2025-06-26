package gui;

import javax.swing.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        //设置窗体大小
        jf.setSize(400,400);
        //设置窗体标题
        jf.setTitle("变强");
        //设置窗体居中
        jf.setLocationRelativeTo(null);
        //设置关闭窗体 结束程序
        jf.setDefaultCloseOperation(3);
        //设置窗体始终置顶
        jf.setAlwaysOnTop(true);

        //取消窗体的默认布局
        jf.setLayout(null);

        JButton btn1=new JButton("确认");
        btn1.setBounds(80,300,100,20);
        jf.add(btn1);

        JButton btn2=new JButton("取消");
        btn2.setBounds(200,300,100,20);
        jf.add(btn2);


        //设置窗体可见
        jf.setVisible(true);
    }
}
