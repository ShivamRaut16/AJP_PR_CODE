import javax.swing.*;
import java.awt.*;

public class Q6GridLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame with the title "GridLayout Example"
        JFrame frame = new JFrame("GridLayout Example");

        // Set the layout manager to GridLayout with 3 rows and 3 columns
        frame.setLayout(new GridLayout(3, 3));

        // Create buttons for the grid cells
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Button " + i);
            frame.add(button);  // Add each button to the frame
        }

        // Set the size and visibility of the frame
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
