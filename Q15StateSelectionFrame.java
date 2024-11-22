import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q15StateSelectionFrame extends JFrame {
    // JLabel to display the selected state
    JLabel selectedStateLabel;

    public Q15StateSelectionFrame() {
        // Set the layout and title of the frame
        setLayout(new FlowLayout());
        setTitle("Select State of India");

        // Create an array of states of India
        String[] states = {
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh",
            "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka",
            "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram",
            "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana",
            "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal", "Andaman and Nicobar Islands",
            "Chandigarh", "Dadra and Nagar Haveli and Daman and Diu", "Lakshadweep", "Delhi", "Puducherry"
        };

        // Create a JComboBox with the array of states
        JComboBox<String> stateComboBox = new JComboBox<>(states);

        // Create a JLabel to display the selected state
        selectedStateLabel = new JLabel("Selected State: None");
        add(stateComboBox);
        add(selectedStateLabel);

        // Add an ActionListener to the JComboBox to handle the state selection
        stateComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the selected state and display it in the JLabel
                String selectedState = (String) stateComboBox.getSelectedItem();
                selectedStateLabel.setText("Selected State: " + selectedState);
            }
        });

        // Set JFrame properties
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the frame
        new Q15StateSelectionFrame();
    }
}
