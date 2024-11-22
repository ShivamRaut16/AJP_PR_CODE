import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q14KeyPressFrame extends JFrame {
    // JLabel to display the key pressed
    JLabel keyLabel;

    public Q14KeyPressFrame() {
        // Set the layout and title
        setLayout(new FlowLayout());
        setTitle("Key Press Display");

        // Create a JLabel to display key presses
        keyLabel = new JLabel("Press any key...");
        add(keyLabel);

        // Add a KeyListener to detect key presses
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                // Get the key pressed and update the JLabel text
                keyLabel.setText("Key pressed: " + e.getKeyChar());
            }
        });

        // Set JFrame properties
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Set the frame focus to capture key events
        setFocusable(true);
    }

    // Main method to launch the program
    public static void main(String[] args) {
        // Create and display the JFrame
        new Q14KeyPressFrame();
    }
}
