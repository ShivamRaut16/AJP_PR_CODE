import java.awt.*;
import java.awt.event.*;

public class Q7ColorMenuAWT extends Frame {
    Q7ColorMenuAWT() {
        // Set the title, size, and layout of the frame
        setTitle("Color Menu Example");
        setSize(500, 500);
        setLayout(null);

        // Create a MenuBar
        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);

        // Create menus for different colors
        Menu blackMenu = new Menu("BLACK");
        menuBar.add(blackMenu);

        Menu blueMenu = new Menu("BLUE");
        menuBar.add(blueMenu);

        Menu greenMenu = new Menu("GREEN");
        menuBar.add(greenMenu);

        Menu redMenu = new Menu("RED");
        menuBar.add(redMenu);

        // Create a menu item inside the "BLACK" menu and disable it
        MenuItem grayItem = new MenuItem("GRAY");
        blackMenu.add(grayItem);
        grayItem.setEnabled(false);  // Disable the "GRAY" menu item

        // Add WindowListener to handle window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Exit the application when the window is closed
            }
        });

        // Set the visibility of the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the frame
        Q7ColorMenuAWT app = new Q7ColorMenuAWT();
    }
}
