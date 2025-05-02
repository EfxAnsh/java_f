package experiment_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private StringBuilder input;

    public Calculator() {
        input = new StringBuilder();

        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttons) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "=":
                try {
                    double result = eval(input.toString());
                    textField.setText(String.valueOf(result));
                    input = new StringBuilder(String.valueOf(result));
                } catch (Exception ex) {
                    textField.setText("Error");
                    input = new StringBuilder();
                }
                break;
            case "C":
                input.setLength(0);
                textField.setText("");
                break;
            default:
                input.append(command);
                textField.setText(input.toString());
        }
    }

    public static double eval(String expr) throws Exception {
        return ((Number) new javax.script.ScriptEngineManager()
            .getEngineByName("JavaScript")
            .eval(expr)).doubleValue();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}
