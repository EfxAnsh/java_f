package experiment_10;

import javax.swing.*;
import java.awt.event.*;

public class ToDoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        JTextField taskField = new JTextField();
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");

        taskField.setBounds(30, 30, 200, 30);
        addButton.setBounds(240, 30, 80, 30);
        removeButton.setBounds(240, 70, 80, 30);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(30, 70, 200, 200);

        addButton.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                model.addElement(task);
                taskField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selected = list.getSelectedIndex();
            if (selected != -1) model.remove(selected);
        });

        frame.add(taskField);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(scrollPane);

        frame.setSize(370, 330);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

