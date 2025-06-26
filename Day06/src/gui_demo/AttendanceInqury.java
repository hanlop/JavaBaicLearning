package gui_demo;

import javax.swing.*;

public class AttendanceInqury {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        //设置窗体大小
        jf.setSize(400,300);
        //设置窗体标题
        jf.setTitle("考勤查询");
        //设置窗体居中
        jf.setLocationRelativeTo(null);
        //设置关闭窗体 结束程序
        jf.setDefaultCloseOperation(3);
        //设置窗体始终置顶
        jf.setAlwaysOnTop(true);
        //取消窗体默认布局
        jf.setLayout(null);

        //设置文本标签
        JLabel attendJLable=new JLabel("考勤日期");
        attendJLable.setBounds(50,20,100,20);
        jf.add(attendJLable);


        DateChooser dateChooser1=DateChooser.getInstance("yyyy/MM/dd");
        DateChooser dateChooser2=DateChooser.getInstance("yyyy/MM/dd");
        //设置开始时间标签
        JLabel startTimeJLable=new JLabel("开始时间");
        startTimeJLable.setBounds(50,70,100,20);
        jf.add(startTimeJLable);
        //设备文本框
        JTextField startTimeJTextField=new JTextField();
        startTimeJTextField.setBounds(50,100,100,20);
        dateChooser1.register(startTimeJTextField);
        jf.add(startTimeJTextField);




        //设置结束时间标签
        JLabel endTimeJLable=new JLabel("结束时间");
        endTimeJLable.setBounds(250,70,100,20);
        jf.add(endTimeJLable);
        //设备文本框
        JTextField endTimeJTextField=new JTextField();
        endTimeJTextField.setBounds(250,100,100,20);
        dateChooser2.register(endTimeJTextField);
        jf.add(endTimeJTextField);


        //设置按钮
        JButton btn=new JButton("确定");
        btn.setBounds(250,180,60,20);
        jf.add(btn);


        //设置窗体可见
        jf.setVisible(true);
    }
}
