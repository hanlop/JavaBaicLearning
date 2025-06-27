package com.oracle;

import javax.swing.*;
import java.util.Random;

public class GameDemo02 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setTitle("拼图");
        jf.setSize(380,400);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);

/*
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
*/

        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //打乱二维数组
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int x=r.nextInt(arr.length);
                int y=r.nextInt(arr[x].length);

                int temp=arr[i][j];
                arr[i][j]=arr[x][y];
                arr[x][y]=temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                JLabel jLabel=new JLabel(new ImageIcon("Day08\\images\\"+arr[i][j]+".png"));
                jLabel.setBounds(j*90,i*90,90,90);
                jf.add(jLabel);
            }
        }
        jf.setVisible(true);
    }

}
