import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class Q12JTreeExample extends JFrame {
    JTree tree;
    JTextField jt;

    public Q12JTreeExample() {
        setLayout(new BorderLayout());
        
        jt = new JTextField("hi");  // Default message for JTextField
        
        // Create the root node and other nodes
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Root", true);
        DefaultMutableTreeNode A = new DefaultMutableTreeNode("A");
        top.add(A);
        
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("B");
        top.add(B);
        
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("a1");
        A.add(a1);
        
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("a2");
        A.add(a2);
        
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("b1");
        B.add(b1);
        
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("b2");
        B.add(b2);
        
        // Create the JTree with the root node
        tree = new JTree(top);
        
        // Add JTree and JTextField to the JFrame window
        add(tree, BorderLayout.CENTER);
        add(jt, BorderLayout.SOUTH);
        
        // Mouse listener to capture clicks on tree nodes
        tree.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                doMouseClicked(me);
            }
        });
        
        // Set the JFrame settings
        setTitle("JTree Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Method to update the JTextField with the selected tree path
    void doMouseClicked(MouseEvent me) {
        TreePath tp = tree.getPathForLocation(me.getX(), me.getY());
        if (tp != null) {
            jt.setText(tp.toString());  // Display the path of the clicked node
        } else {
            jt.setText(" ");  // If no node is selected, clear the text field
        }
    }

    public static void main(String[] args) {
        new Q12JTreeExample();  // Create and show the JFrame
    }
}
