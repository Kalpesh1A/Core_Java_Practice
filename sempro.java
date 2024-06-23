import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class StopwatchGUI extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private JButton startButton;
    private JButton stopButton;
    private JButton resetButton;
    private JButton lapButton;
    private Timer timer;
    private int milliseconds = 0;
    private int seconds = 0;
    private boolean isRunning = false;
    private List<String> laps = new ArrayList<>();
    private JTextArea lapDisplay;

    public StopwatchGUI() {
        setTitle("Stopwatch");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeLabel = new JLabel("0:00.0");
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 32));

        JPanel buttonPanel = new JPanel();
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");
        lapButton = new JButton("Lap");

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);
        lapButton.addActionListener(this);

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(lapButton);

        lapDisplay = new JTextArea(10, 20);
        lapDisplay.setEditable(false);

        JPanel displayPanel = new JPanel();
        displayPanel.add(timeLabel);
        displayPanel.add(lapDisplay);

        add(displayPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

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
                lapButton.setEnabled(true);
            }
        } else if (e.getSource() == stopButton) {
            if (isRunning) {
                timer.stop();
                isRunning = false;
                startButton.setEnabled(true);
                stopButton.setEnabled(false);
                lapButton.setEnabled(false);
            }
        } else if (e.getSource() == resetButton) {
            timer.stop();
            isRunning = false;
            milliseconds = 0;
            seconds = 0;
            laps.clear();
            lapDisplay.setText("");
            updateDisplay();
            startButton.setEnabled(true);
            stopButton.setEnabled(false);
            lapButton.setEnabled(false);
        } else if (e.getSource() == lapButton) {
            if (isRunning) {
                String lapTime = timeLabel.getText();
                laps.add(lapTime);
                updateLapDisplay();
            }
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

    private void updateLapDisplay() {
        lapDisplay.setText("");
        for (int i = 0; i < laps.size(); i++) {
            lapDisplay.append("Lap " + (i + 1) + ": " + laps.get(i) + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StopwatchGUI stopwatch = new StopwatchGUI();
            stopwatch.setVisible(true);
        });
    }
}
