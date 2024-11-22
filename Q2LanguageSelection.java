import javax.swing.*;

public class Q2LanguageSelection {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Language Selection");

        // Create checkboxes for languages
        JCheckBox marathiCheckBox = new JCheckBox("Marathi");
        JCheckBox hindiCheckBox = new JCheckBox("Hindi");
        JCheckBox englishCheckBox = new JCheckBox("English");
        JCheckBox sanskritCheckBox = new JCheckBox("Sanskrit");

        // Set positions of the checkboxes
        marathiCheckBox.setBounds(50, 50, 150, 30);
        hindiCheckBox.setBounds(50, 100, 150, 30);
        englishCheckBox.setBounds(50, 150, 150, 30);
        sanskritCheckBox.setBounds(50, 200, 150, 30);

        // Create a button to show the selected languages
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(50, 250, 150, 40);


        // Add components to the frame
        frame.add(marathiCheckBox);
        frame.add(hindiCheckBox);
        frame.add(englishCheckBox);
        frame.add(sanskritCheckBox);
        frame.add(submitButton);

        // Set frame properties
        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
