import java.awt.*;
import java.awt.event.*;

public class Q9AdditionUsingEvent extends Frame implements ActionListener {
    private TextField num1Field, num2Field, resultField;
    private Button addButton;

    public Q9AdditionUsingEvent() {
        // Set the frame title and layout
        setTitle("Addition of Two Numbers");
        setLayout(new FlowLayout());
        setSize(300, 200);
        
        // Create labels and text fields
        Label label1 = new Label("Enter First Number: ");
        num1Field = new TextField(10);
        
        Label label2 = new Label("Enter Second Number: ");
        num2Field = new TextField(10);
        
        Label resultLabel = new Label("Result: ");
        resultField = new TextField(10);
        resultField.setEditable(false);  // Result field should not be editable
        
        // Create the Add button
        addButton = new Button("Add");
        
        // Add action listener to the button
        addButton.addActionListener(this);
        
        // Add components to the frame
        add(label1);
        add(num1Field);
        add(label2);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(addButton);
        
        // Close the window using WindowListener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        // Make the frame visible
        setVisible(true);
    }

    // Implement the actionPerformed method for handling events
    public void actionPerformed(ActionEvent e) {
        try {
            // Get the numbers entered by the user
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            
            // Perform the addition
            double sum = num1 + num2;
            
            // Display the result in the result field
            resultField.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            // Handle invalid input
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        // Create and display the frame
        new Q9AdditionUsingEvent();
    }
}
