package gui;

import javax.swing.*;

public class JFrameDemo03 {
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

        JLabel text=new JLabel("好好学习");
        text.setBounds(0,0,100,20);
        jf.add(text);

        ImageIcon imageIcon=new ImageIcon("Day06\\imgs\\mn.png");
        JLabel image=new JLabel(imageIcon);
        image.setBounds(50,50,100,143);
        jf.add(image);


        //设置窗体可见
        jf.setVisible(true);
    }
}
