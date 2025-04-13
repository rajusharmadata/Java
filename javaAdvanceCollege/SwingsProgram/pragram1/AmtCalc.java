// Define a package named SwingsProgram
package SwingsProgram;

// Import necessary classes for AWT components and events
import java.awt.*;
import java.awt.event.*;

// Main class that extends Frame and implements ActionListener to handle button click events
public class AmtCalc extends Frame implements ActionListener {

    // Declare GUI components
    Label qtyLbl, rateLbl, resultLbl;      // Labels for Quantity, Rate, and Result
    TextField qtyFld, rateFld;             // Input fields for Quantity and Rate
    Button calcBtn;                        // Button to calculate the amount

    // Constructor
    public AmtCalc() {
        // Set window title
        setTitle("Amount Calc");

        // Set window size (width, height)
        setSize(300, 200);

        // Disable layout manager to use absolute positioning
        setLayout(null);

        // Create and position Quantity label
        qtyLbl = new Label("Qty:");
        qtyLbl.setBounds(20, 40, 50, 25);
        add(qtyLbl); // Add it to the Frame

        // Create and position Rate label
        rateLbl = new Label("Rate:");
        rateLbl.setBounds(20, 80, 50, 25);
        add(rateLbl);

        // Create and position Quantity input field
        qtyFld = new TextField();
        qtyFld.setBounds(80, 40, 150, 25);
        add(qtyFld);

        // Create and position Rate input field
        rateFld = new TextField();
        rateFld.setBounds(80, 80, 150, 25);
        add(rateFld);

        // Create and position Calculate button
        calcBtn = new Button("Calc");
        calcBtn.setBounds(100, 120, 80, 30);
        add(calcBtn);

        // Create and position Result label to display calculated amount
        resultLbl = new Label("Amt: ");
        resultLbl.setBounds(20, 160, 200, 25);
        add(resultLbl);

        // Add ActionListener to button to listen for click events
        calcBtn.addActionListener(this);

        // Handle closing the window using a WindowAdapter
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Close the application when the window is closed
            }
        });
    }

    // Handle the button click event
    public void actionPerformed(ActionEvent e) {
        try {
            // Get quantity from input field and convert to integer
            int qty = Integer.parseInt(qtyFld.getText());

            // Get rate from input field and convert to double
            double rate = Double.parseDouble(rateFld.getText());

            // Calculate amount = qty × rate
            double amt = qty * rate;

            // Show the result in the result label
            resultLbl.setText("Amt: " + amt);
        } catch (NumberFormatException ex) {
            // If the input is invalid (e.g. not a number), show an error message
            resultLbl.setText("Invalid input");
        }
    }

    // Main method to launch the application
    public static void main(String[] args) {
        // Create an instance of the Frame
        AmtCalc frame = new AmtCalc();

        // Make the window visible
        frame.setVisible(true);
    }
}
