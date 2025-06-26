package gui_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickEvent {
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
        //取消窗体默认布局
        jf.setLayout(null);

        //添加按钮组件
        JButton btn=new JButton("你点我啊");
        btn.setBounds(100,100,100,20);
        jf.add(btn);

        //添加点击事件
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你再点试试");
            }
        });


        //设置窗体可见
        jf.setVisible(true);
    }
}
