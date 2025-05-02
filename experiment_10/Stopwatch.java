package experiment_10;

import javax.swing.*;
import java.awt.event.*;

public class Stopwatch {
    private static int elapsedSeconds = 0;
    private static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        JLabel timeLabel = new JLabel("0", SwingConstants.CENTER);
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        timeLabel.setBounds(100, 30, 100, 50);
        startButton.setBounds(30, 100, 80, 30);
        stopButton.setBounds(120, 100, 80, 30);
        resetButton.setBounds(210, 100, 80, 30);

        timer = new Timer(1000, e -> {
            elapsedSeconds++;
            timeLabel.setText(String.valueOf(elapsedSeconds));
        });

        startButton.addActionListener(e -> timer.start());
        stopButton.addActionListener(e -> timer.stop());
        resetButton.addActionListener(e -> {
            timer.stop();
            elapsedSeconds = 0;
            timeLabel.setText("0");
        });

        frame.add(timeLabel);
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);

        frame.setSize(330, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
