package gui;

import javax.swing.*;

public class JFrameDemo01 {
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


        //设置窗体可见
        jf.setVisible(true);
    }
}
