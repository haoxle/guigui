package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiLogin implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel success;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton button;

    public GuiLogin() {
        frame = new JFrame();
        panel = new JPanel();
        userLabel = new JLabel("User");
        passwordLabel = new JLabel("Password");
        success = new JLabel("");
        userText = new JTextField();
        passwordText = new JPasswordField();
        button = new JButton("Login");

        button.addActionListener(this);


        userText.setBounds(100, 20, 165, 25);
        userLabel.setBounds(10, 20, 80, 25);
        passwordLabel.setBounds(10, 50, 80, 25);
        passwordText.setBounds(100, 50, 165, 25);
        success.setBounds(10, 110, 300, 25);
        button.setBounds(10, 80, 80, 25);

        frame.setSize(350, 200);
        frame.add(panel);

        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(button);
        panel.add(success);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login");
        panel.setLayout(null);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new GuiLogin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if(user.toLowerCase().equals("hao") && password.equals("pandob1997")) {
            success.setText("Logged in!");
        }
    }
}
