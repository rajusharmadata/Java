// Package declaration, organize your code inside folders
package SwingsProgram.program2;

// Importing necessary Swing and AWT classes
import javax.swing.*;        // For GUI components like JFrame, JLabel, JButton, JTextField
import java.awt.*;           // For layouts like FlowLayout
import java.awt.event.*;     // For handling button click events

// Main class that runs the program
public class SwingAddition {
    public static void main(String args[]) {
        // Creating an object of Abc class which builds the GUI
        Abc obj = new Abc();
    }
}

// Abc class extends JFrame to create a window, implements ActionListener for button click
class Abc extends JFrame implements ActionListener {
    // Declaring GUI components
    JLabel l1;         // Label for first number
    JTextField t1;     // Text field for first number input
    JLabel l2;         // Label for second number
    JTextField t2;     // Text field for second number input
    JButton b;         // Button to perform addition
    JLabel l3;         // Label to display result
    JLabel msg;        // Message at top for instructions

    // Constructor of Abc class - this builds the GUI
    public Abc() {
        // Setting layout to FlowLayout, which arranges components left to right
        setLayout(new FlowLayout());

        // Creating components and initializing them
        msg = new JLabel("Only calculate the integer sum");  // Info message

        l1 = new JLabel("First Number:");  // Label for input 1
        t1 = new JTextField(20);           // Input field 1 (20 columns wide)

        l2 = new JLabel("Second Number:"); // Label for input 2
        t2 = new JTextField(20);           // Input field 2

        b = new JButton("Add");            // Add button

        l3 = new JLabel("Result");         // Result label

        // Adding components to JFrame
        add(msg);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);

        // Adding event listener to the button
        b.addActionListener(this);

        // Setting JFrame properties
        setVisible(true);              // Make the window visible
        setSize(250, 400);             // Set size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the window on exit
    }

    // Method that is called when the button is clicked
    public void actionPerformed(ActionEvent ae) {
        try {
            // Get numbers from text fields and convert to integers
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            // Calculate sum
            int value = num1 + num2;

            // Set result in the result label
            l3.setText("Sum: " + value);
        } catch (Exception e) {
            // If there's an input error (e.g. letters or empty fields), show message
            System.out.println(e);
            l3.setText("Please enter a valid input");
        }
    }
}
