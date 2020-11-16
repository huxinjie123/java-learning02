package com.xjhu.study.week6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author huxinjie
 * @date 2020/11/9 14:35
 */
public class LoginFrame extends JFrame{
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel loginPanel;
    private JPanel logoPanel;
    private JLabel logoLabel;
    private JTextField userName;
    private JButton sure;
    private JLabel loginLabel;
    private JLabel tipLabel;
    private JPasswordField passwordField;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public  LoginFrame(){
        init();
        sure.addActionListener(e -> {
            
        });
    }
    private void init(){
        JFrame frame = new JFrame("LoginFrame");
        frame.setContentPane(new LoginFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
       new LoginFrame();
    }
}
