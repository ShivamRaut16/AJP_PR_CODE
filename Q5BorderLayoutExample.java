import javax.swing.*;
import java.awt.*;

public class Q5BorderLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame with the title "BorderLayout Example"
        JFrame frame = new JFrame("BorderLayout Example");

        // Set the layout manager to BorderLayout
        frame.setLayout(new BorderLayout());

        // Create buttons for each region of the BorderLayout
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        // Add the buttons to the frame in respective regions
        frame.add(northButton, BorderLayout.NORTH);  // Add to the North
        frame.add(southButton, BorderLayout.SOUTH);  // Add to the South
        frame.add(eastButton, BorderLayout.EAST);    // Add to the East
        frame.add(westButton, BorderLayout.WEST);    // Add to the West
        frame.add(centerButton, BorderLayout.CENTER); // Add to the Center

        // Set the size and visibility of the frame
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
