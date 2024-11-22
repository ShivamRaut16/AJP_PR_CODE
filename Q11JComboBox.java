import javax.swing.*;
import java.awt.*;

public class Q11JComboBox extends JFrame {

    public Q11JComboBox() {
        // Set the title for the JFrame
        setTitle("JComboBox Example");

        // Create a JComboBox with a list of items
        String[] languages = {"Marathi", "Hindi", "English", "Sanskrit"};
        JComboBox<String> comboBox = new JComboBox<>(languages);

        // Add the JComboBox to the JFrame
        add(comboBox, BorderLayout.CENTER);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window and make it visible
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create the frame and show it
        new Q11JComboBox();
    }
}
