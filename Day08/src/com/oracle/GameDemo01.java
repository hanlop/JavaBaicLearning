package com.oracle;

import javax.swing.*;

public class GameDemo01 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setTitle("拼图");
        jf.setSize(380,400);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);

        for(int i=0;i<4;i++)
        {
            JLabel jLabel=new JLabel(new ImageIcon("Day08\\images\\"+(i+1)+".png"));
            jLabel.setBounds(i*90,0,90,90);
            jf.add(jLabel);
        }

        for(int i=0;i<4;i++)
        {
            JLabel jLabel=new JLabel(new ImageIcon("Day08\\images\\"+(i+5)+".png"));
            jLabel.setBounds(i*90,90,90,90);
            jf.add(jLabel);

        }

        for(int i=0;i<4;i++)
        {
            JLabel jLabel=new JLabel(new ImageIcon("Day08\\images\\"+(i+9)+".png"));
            jLabel.setBounds(i*90,180,90,90);
            jf.add(jLabel);
        }

        for(int i=0;i<4;i++)
        {
            JLabel jLabel=new JLabel(new ImageIcon("Day08\\images\\"+(i+13)+".png"));
            jLabel.setBounds(i*90,270,90,90);
            jf.add(jLabel);
        }


        jf.setVisible(true);
    }
}
