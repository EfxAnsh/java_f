package experiment_10;

import javax.swing.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        userLabel.setBounds(30, 30, 80, 30);
        passLabel.setBounds(30, 70, 80, 30);
        userField.setBounds(120, 30, 150, 30);
        passField.setBounds(120, 70, 150, 30);
        loginButton.setBounds(120, 110, 100, 30);

        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userField);
        frame.add(passField);
        frame.add(loginButton);

        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(frame, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid Credentials");
            }
        });

        frame.setSize(350, 220);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
