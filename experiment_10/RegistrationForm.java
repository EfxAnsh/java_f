package experiment_10;
import javax.swing.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passLabel = new JLabel("Password:");
        JLabel confirmPassLabel = new JLabel("Confirm Password:");
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JPasswordField confirmPassField = new JPasswordField();
        JButton registerButton = new JButton("Register");
        JLabel messageLabel = new JLabel();

        nameLabel.setBounds(30, 30, 150, 30);
        emailLabel.setBounds(30, 70, 150, 30);
        passLabel.setBounds(30, 110, 150, 30);
        confirmPassLabel.setBounds(30, 150, 150, 30);
        nameField.setBounds(180, 30, 150, 30);
        emailField.setBounds(180, 70, 150, 30);
        passField.setBounds(180, 110, 150, 30);
        confirmPassField.setBounds(180, 150, 150, 30);
        registerButton.setBounds(100, 200, 150, 30);
        messageLabel.setBounds(30, 240, 300, 30);

        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String pass = new String(passField.getPassword());
            String confirm = new String(confirmPassField.getPassword());

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                messageLabel.setText("All fields are required!");
            } else if (!email.contains("@")) {
                messageLabel.setText("Invalid email address!");
            } else if (!pass.equals(confirm)) {
                messageLabel.setText("Passwords do not match!");
            } else {
                messageLabel.setText("Registration Successful!");
            }
        });

        frame.add(nameLabel); frame.add(emailLabel); frame.add(passLabel);
        frame.add(confirmPassLabel); frame.add(nameField); frame.add(emailField);
        frame.add(passField); frame.add(confirmPassField); frame.add(registerButton);
        frame.add(messageLabel);

        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
