import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopwatchGUI extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private JButton startButton;
    private JButton stopButton;
    private JButton resetButton;
    private Timer timer;
    private int milliseconds = 0;
    private int seconds = 0;
    private boolean isRunning = false;

    public StopwatchGUI() {
        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        timeLabel = new JLabel("0:00.0");
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 32));

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        add(timeLabel);
        add(startButton);
        add(stopButton);
        add(resetButton);

        timer = new Timer(100, e -> updateTime());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!isRunning) {
                timer.start();
                isRunning = true;
                startButton.setEnabled(false);
                stopButton.setEnabled(true);
                resetButton.setEnabled(true);
            }
        } else if (e.getSource() == stopButton) {
            if (isRunning) {
                timer.stop();
                isRunning = false;
                startButton.setEnabled(true);
                stopButton.setEnabled(false);
            }
        } else if (e.getSource() == resetButton) {
            timer.stop();
            isRunning = false;
            milliseconds = 0;
            seconds = 0;
            updateDisplay();
            startButton.setEnabled(true);
            stopButton.setEnabled(false);
            resetButton.setEnabled(false);
        }
    }

    private void updateTime() {
        milliseconds += 100;
        if (milliseconds >= 1000) {
            seconds++;
            milliseconds = 0;
        }
        updateDisplay();
    }

    private void updateDisplay() {
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        timeLabel.setText(minutes + ":" + String.format("%02d", remainderSeconds) + "." + (milliseconds / 100));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StopwatchGUI stopwatch = new StopwatchGUI();
            stopwatch.setVisible(true);
        });
    }
}