import javax.swing.*;

public class Q1ThreeButtons {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Three Buttons Example");

        // Create three buttons
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JButton resetButton = new JButton("Reset");

        // Set button positions
        okButton.setBounds(50, 50, 100, 40);
        cancelButton.setBounds(200, 50, 100, 40);
        resetButton.setBounds(350, 50, 100, 40);

        // Add buttons to the frame
        frame.add(okButton);
        frame.add(cancelButton);
        frame.add(resetButton);

        // Set frame properties
        frame.setSize(500, 200);
        frame.setLayout(null); // No default layout, so we use setBounds
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
