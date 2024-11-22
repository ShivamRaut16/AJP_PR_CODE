import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q10MenuBar extends JFrame {
    
    public Q10MenuBar() {
        // Set the title for the JFrame
        setTitle("Menu Bar Example");

        // Create the MenuBar
        MenuBar menuBar = new MenuBar();

        // Create menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu viewMenu = new Menu("View");

        // Add menu items to the File menu
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Add menu items to the Edit menu
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add menu items to the View menu
        MenuItem zoomInItem = new MenuItem("Zoom In");
        MenuItem zoomOutItem = new MenuItem("Zoom Out");
        viewMenu.add(zoomInItem);
        viewMenu.add(zoomOutItem);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        // Set the menu bar to the frame
        setMenuBar(menuBar);

        // Add action listener for exit item
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Close the application
            }
        });

        // Add a label to the frame
        JLabel label = new JLabel("Menu Bar Example in JFrame", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        add(label, BorderLayout.CENTER);

        // Set the size and visibility of the frame
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application closes properly
    }

    public static void main(String[] args) {
        // Run the program as a Swing application
        new Q10MenuBar();
    }
}
