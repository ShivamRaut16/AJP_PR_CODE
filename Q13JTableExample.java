import javax.swing.*;
import java.awt.*;

public class Q13JTableExample extends JFrame {

    public Q13JTableExample() {
        // Create column names for the JTable
        String[] columnNames = {"ID", "Name", "Age"};

        // Create data for the JTable
        Object[][] data = {
            {1, "Alice", 22},
            {2, "Bob", 24},
            {3, "Charlie", 23},
            {4, "David", 25}
        };

        // Create JTable with the data and column names
        JTable table = new JTable(data, columnNames);

        // Add the JTable to the JScrollPane for better viewing and scrolling
        JScrollPane scrollPane = new JScrollPane(table);

        // Set layout and add the JScrollPane (which contains JTable) to the JFrame window
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        // JFrame settings
        setTitle("JTable Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q13JTableExample();  // Create and show the JFrame
    }
}
