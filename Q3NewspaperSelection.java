import javax.swing.*;

public class Q3NewspaperSelection {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Newspaper Selection");

        // Array of newspaper names
        String[] newspapers = {
            "The Times of India", 
            "The Hindu", 
            "Indian Express", 
            "Hindustan Times", 
            "Deccan Chronicle", 
            "Dainik Bhaskar", 
            "The Economic Times", 
            "The Pioneer", 
            "The Telegraph", 
            "Business Standard"
        };

        // Create a JList to display the newspapers
        JList<String> newspaperList = new JList<>(newspapers);
        newspaperList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Allow multiple selections

        // Add the JList to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(newspaperList);
        scrollPane.setBounds(50, 50, 200, 150);

        // Create a button to show selected newspapers
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 220, 100, 30);


        // Add components to the frame
        frame.add(scrollPane);
        frame.add(submitButton);

        // Set frame properties
        frame.setSize(300, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
