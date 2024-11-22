import java.awt.*;
import javax.swing.*;

public class Q8SimpleProgressBarDemo extends JFrame {
    private JProgressBar progressBar;

    public Q8SimpleProgressBarDemo() {
        // Set the title and layout of the frame
        setTitle("JProgressBar Demo");
        setLayout(new FlowLayout());
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a progress bar with a minimum value of 0 and a maximum value of 100
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0); // Set the initial value to 0
        progressBar.setStringPainted(true); // Show percentage as a string on the bar

        // Add the progress bar to the frame
        add(progressBar);

        // Show the frame
        setVisible(true);

        // Simulate progress in a loop
        for (int i = 0; i <= 100; i++) {
            try {
                progressBar.setValue(i); // Update the progress bar value
                Thread.sleep(50); // Sleep for 50 milliseconds to simulate progress
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create and show the progress bar demo
        new Q8SimpleProgressBarDemo();
    }
}
