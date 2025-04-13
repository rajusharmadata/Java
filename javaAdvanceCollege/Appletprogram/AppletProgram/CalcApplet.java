package AppletProgram;

// Simple Java Applet to Calculate Amount
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// Define class 'CalcApplet' inheriting from Applet
public class CalcApplet extends Applet implements ActionListener {
    // Declare components
    Label lblQty, lblRate, lblAmount;
    TextField txtQty, txtRate, txtAmount;
    Button btnCalculate;

    // Initialize applet
    public void init() {
        // Set layout for the applet
        setLayout(new FlowLayout());

        // Initialize components
        lblQty = new Label("Quantity: ");
        lblRate = new Label("Rate: ");
        lblAmount = new Label("Amount: ");

        txtQty = new TextField(10);
        txtRate = new TextField(10);
        txtAmount = new TextField(10);
        txtAmount.setEditable(false);

        btnCalculate = new Button("Calculate");

        // Add components to the applet
        add(lblQty);
        add(txtQty);
        add(lblRate);
        add(txtRate);
        add(lblAmount);
        add(txtAmount);
        add(btnCalculate);

        // Add action listener to the button
        btnCalculate.addActionListener(this);
    }

    // Handle button click event
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse input values
            int qty = Integer.parseInt(txtQty.getText());
            double rate = Double.parseDouble(txtRate.getText());

            // Calculate amount
            double amount = qty * rate;

            // Display amount
            txtAmount.setText(String.valueOf(amount));
        } catch (NumberFormatException ex) {
            txtAmount.setText("Invalid input");
        }
    }
}

/* 
    Applet HTML Tag:
    <applet code="CalcApplet.class" width="600" height="600">
    </applet> 
*/
