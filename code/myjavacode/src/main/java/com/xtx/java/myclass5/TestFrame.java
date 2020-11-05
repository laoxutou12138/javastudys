package com.xtx.java.myclass5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName TestFrame
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
public class TestFrame {
    private JPanel mainPanel;
    private JTextField nameFiled;
    private JButton checkBtn;
    private JTextField passwordFiled;

    public TestFrame() {
        checkBtn.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TestFrame");
        frame.setContentPane(new TestFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        //frame.pack();
        frame.setVisible(true);
    }
}
