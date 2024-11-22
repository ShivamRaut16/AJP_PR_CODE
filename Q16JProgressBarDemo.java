import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q16JProgressBarDemo extends JFrame {
    private JProgressBar progressBar;
    private JButton startButton;

    public Q16JProgressBarDemo() {
        // Set the layout and title of the frame
        setLayout(new FlowLayout());
        setTitle("JProgressBar Demo");

        // Create a progress bar with a minimum value of 0 and maximum value of 100
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0); // Set the initial value to 0
        progressBar.setStringPainted(true); // Show percentage as a string on the bar
        progressBar.setPreferredSize(new Dimension(300, 30)); // Set a preferred size for the progress bar

        // Create a button to start the progress
        startButton = new JButton("Start");
        add(startButton);
        add(progressBar);

        // Action listener for the start button
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Simulate a task and update the progress bar value
                new Thread(new Runnable() {
                    public void run() {
                        for (int i = 0; i <= 100; i++) {
                            progressBar.setValue(i); // Update the progress bar value
                            try {
                                Thread.sleep(50); // Simulate time-consuming task
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });

        // Set JFrame properties
        setSize(400, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the frame
        new Q16JProgressBarDemo();
    }
}
