package com.game9;
/*
     判断游戏是否成功
        定义游戏成功的winDatas数组,前15张图片到位
        定义方法isSuccess判断游戏是否成功
            遍历任意一个数组
            如果有一个元素不一样,返回false
            都一样则返回true
        在每次移动(按钮事件)后调用方法判断
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//定义类PictureFrame,继承JFrame
public class PictureFrame extends JFrame {
    //成员变量,图片编号数组
    private int[][] datas = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义游戏成功的winDatas数组,前15张图片归位就算成功
    private int[][] winDatas = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //成员变量, 用于记录0号图片的位置
    //x0 :在哪个一维数组
    //y0 :在一维数组的位置
    private int x0;
    private int y0;

    //成员变量上左下右,求助,重置等按钮
    private JButton shangButton;
    private JButton zuoButton;
    private JButton xiaButton;
    private JButton youButton;
    private JButton qiuZhuButton;
    private JButton chongZhiButton;

    //成员变量面板
    private JPanel imagePanel;

    //重绘的方法rePainView()
    private void rePainView() {
        //1.将imagePanel提升到成员位置
        //2.调用imagePanel的removeAll()方法移除所有组件
        imagePanel.removeAll();
        //3.拼图重绘的代码(复制之前写好的)
        for (int i = datas.length - 1; i >= 0; i--) {
            for (int j = 0; j < datas[i].length; j++) {
                JLabel imageLabel = new JLabel(new ImageIcon("day09\\images\\" + datas[i][j] + ".png"));
                imageLabel.setBounds(j * 90, i * 90, 90, 90);
                imagePanel.add(imageLabel);
            }
        }
        this.add(imagePanel);
        //4.调用imagePanel的repaint()方法重绘窗体
        imagePanel.repaint();
    }

    //游戏成功的方法
    private void success() {
        //将图片安装顺序展示
        datas = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        //设置上左下右按钮失效
        shangButton.setEnabled(false);
        youButton.setEnabled(false);
        xiaButton.setEnabled(false);
        zuoButton.setEnabled(false);
    }

    //定义方法isSuccess判断游戏是否成功
    public boolean isSuccess() {
        //遍历任意一个数组
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                //如果有一个元素,它倆不一样,证明还没有成功,返回false
                if (datas[i][j] != winDatas[i][j]) {
                    return false;
                }
            }
        }
        return true; //都一样返回true
    }

    //给按钮添加事件的方法
    private void addButtonEvent() {
        shangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("上");
                //1.边界处理,当x0=3,不能继续向上移动
                if (x0 == 3) {
                    return;
                }
                //2.交换0号图片和下方图片
                datas[x0][y0] = datas[x0 + 1][y0];
                datas[x0 + 1][y0] = 0;
                x0 = x0 + 1;

                //调用方法判断,如果游戏成功,设置按钮不能点击
                if (isSuccess()) {
                    success();
                }

                //3.调用重绘的方法rePainView()
                rePainView();
            }
        });
        zuoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("左");
                //1.边界处理,当y0=3,不能继续向上移动
                if (y0 == 3) {
                    return;
                }
                //2.交换0号图片和右方图片
                datas[x0][y0] = datas[x0][y0 + 1];
                datas[x0][y0 + 1] = 0;
                y0 = y0 + 1;

                //调用方法判断,如果游戏成功,设置按钮不能点击
                if (isSuccess()) {
                    success();
                }

                //3.调用重绘的方法rePainView()
                rePainView();
            }
        });
        xiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("下");
                //1.边界处理,边界x0==0
                if (x0 == 0) {
                    return;
                }
                //2.交换0号图片和上方图片
                datas[x0][y0] = datas[x0 - 1][y0];
                datas[x0 - 1][y0] = 0;
                x0 = x0 - 1;
                //3.调用重绘的方法rePainView()
                rePainView();
            }
        });
        youButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("右");
                /*
                    图片右移规则
                        边界y0==0
                        datas[x0][y0]=datas[x0][y0-1];
                        datas[x0][y0-1]=0;
                        y0=y0-1;
                 */
                //1.边界处理,边界y0==0
                if (y0 == 0) {
                    return;
                }
                //2.交换0号图片和左方图片
                datas[x0][y0] = datas[x0][y0 - 1];
                datas[x0][y0 - 1] = 0;
                y0 = y0 - 1;
                //3.调用重绘的方法rePainView()
                rePainView();
            }
        });

        qiuZhuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("求助");
                //1.调用success成功的方法
                success();
                //2.重绘方法进行重绘
                rePainView();
            }
        });

        chongZhiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("重置");
            }
        });
    }

    //在PictureFrame类中编写空参构造
    public PictureFrame() {
        //initFrame(); 窗体基本设置
        initFrame();
        //图片打乱要在绘制窗口组件之前
        randomDate();
        //paintView(); 窗口组件
        paintView();
        //调用方法,给按钮添加事件
        addButtonEvent();
        //setVisible(true); 窗体可见
        setVisible(true);
    }

    //窗口组件
    private void paintView() {
        //窗口组件1
        //标题图片
        JLabel titleLabel = new JLabel(new ImageIcon("day09\\images\\title.png"));
        titleLabel.setBounds(254, 27, 232, 57);
        this.add(titleLabel);
        //二维数组+JPanel面板,实现图片打乱
        //二维数组: 移动到成员位置
//        int[][] datas = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
        //JPanel面板,设置大小
        imagePanel = new JPanel();
        imagePanel.setBounds(150, 114, 360, 360);
        //取消JPanel面板默认布局
        imagePanel.setLayout(null);
        //遍历二维数组,得到图片编号
        for (int i = datas.length - 1; i >= 0; i--) {
            for (int j = 0; j < datas[i].length; j++) {
                //通过JLabel加载图片
                JLabel imageLabel = new JLabel(new ImageIcon("day09\\images\\" + datas[i][j] + ".png"));
                //根据规律,调整图片位置
                imageLabel.setBounds(j * 90, i * 90, 90, 90);
                //将JLabel图片添加到JPanel面板
                imagePanel.add(imageLabel);
            }
        }
        //将面板添加到窗体
        this.add(imagePanel);

        //窗体组件2
        //参照图
        JLabel canZhaoTuLabel = new JLabel(new ImageIcon("day09\\images\\canZhaoTu.png"));
        canZhaoTuLabel.setBounds(574, 114, 122, 121);
        this.add(canZhaoTuLabel);
        //上按钮
        shangButton = new JButton(new ImageIcon("day09\\images\\shang.png"));
        shangButton.setBounds(732, 265, 57, 57);
        this.add(shangButton);
        //左按钮
        zuoButton = new JButton(new ImageIcon("day09\\images\\zuo.png"));
        zuoButton.setBounds(650, 347, 57, 57);
        this.add(zuoButton);
        //下按钮
        xiaButton = new JButton(new ImageIcon("day09\\images\\xia.png"));
        xiaButton.setBounds(732, 347, 57, 57);
        this.add(xiaButton);
        //右按钮
        youButton = new JButton(new ImageIcon("day09\\images\\you.png"));
        youButton.setBounds(813, 347, 57, 57);
        this.add(youButton);
        //求助按钮
        qiuZhuButton = new JButton(new ImageIcon("day09\\images\\qiuzhu.png"));
        qiuZhuButton.setBounds(626, 444, 108, 45);
        this.add(qiuZhuButton);
        //重置按钮
        chongZhiButton = new JButton(new ImageIcon("day09\\images\\chongzhi.png"));
        chongZhiButton.setBounds(786, 444, 108, 45);
        this.add(chongZhiButton);
        //背景图
        JLabel backgroundLabel = new JLabel(new ImageIcon("day09\\images\\background.png"));
        backgroundLabel.setBounds(0, 0, 968, 530);
        this.add(backgroundLabel);
    }

    //窗体基本设置
    private void initFrame() {
        //设置大小
        this.setSize(960, 565);
        //设置标题
        this.setTitle("动漫拼图");
        //窗体居中
        this.setLocationRelativeTo(null);
        //窗体关闭时停止程序(控制台)
        this.setDefaultCloseOperation(3);
        //窗体置顶
        this.setAlwaysOnTop(true);
        //取消窗体默认布局
        this.setLayout(null);
    }

    //图片打乱
    private void randomDate() {
        Random r = new Random();
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                int x = r.nextInt(datas.length);
                int y = r.nextInt(datas[i].length);
                //交换元素
                int temp = datas[i][j];
                datas[i][j] = datas[x][y];
                datas[x][y] = temp;
            }
        }
        //图片打乱后, 定位0号图片的位置
        lo:
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                //如果二维数组元素为0, 代表就是0号图片
                if (datas[i][j] == 0) {
                    //记录索引
                    x0 = i;
                    y0 = j;
                    //循环标号,结束外层循环
                    break lo;
                }
            }
        }
    }
}
