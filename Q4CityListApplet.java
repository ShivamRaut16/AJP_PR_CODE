import javax.swing.*;

public class Q4CityListApplet {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("City List");

        // Array of city names
        String[] cities = {
            "Mumbai", "Delhi", "Bangalore", "Chennai", 
            "Hyderabad", "Kolkata", "Pune", "Ahmedabad", 
            "Jaipur", "Lucknow"
        };

        // Create a JList to display the cities
        JList<String> cityList = new JList<>(cities);
        cityList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Allow single selection

        // Add the JList to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(cityList);
        scrollPane.setBounds(50, 50, 200, 150);

        // Create a button to display the selected city
        JButton submitButton = new JButton("Select City");
        submitButton.setBounds(100, 220, 120, 30);


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
