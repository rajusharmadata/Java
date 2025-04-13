// Package declaration
package AppletProgram;

// Import required classes
import java.applet.Applet;  // For Applet functionality
import java.awt.*;          // For GUI components like Button, Label, TextField

/*
 * This HTML applet tag is used to run the applet in applet viewer or browsers that support applets.
 * <applet code="AppletButton" width=400 height=300>
 * </applet>
 */

// Class definition extending Applet
public class AppletButton extends Applet {

    // This method is called when the applet is initialized
    public void init() {

        // Disable default layout manager for absolute positioning
        setLayout(null);

        // Create Labels
        Label one = new Label("ONE:");
        Label two = new Label("TWO:");
        Label three = new Label("THREE:");

        // Create TextFields
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();

        // Create Buttons
        Button btnSubmit = new Button("Submit");
        Button btnClear = new Button("Clear");
        Button btnExit = new Button("Exit");
        Button btnPrint = new Button("200");  // Custom button with label "200"

        // Position Labels using setBounds(x, y, width, height)
        one.setBounds(30, 30, 80, 20);
        two.setBounds(30, 60, 80, 20);
        three.setBounds(30, 90, 80, 20);

        // Position TextFields
        tf1.setBounds(120, 30, 150, 20);
        tf2.setBounds(120, 60, 150, 20);
        tf3.setBounds(120, 90, 150, 20);

        // Position Buttons
        btnSubmit.setBounds(30, 140, 80, 30);
        btnClear.setBounds(120, 140, 80, 30);
        btnExit.setBounds(210, 140, 80, 30);
        btnPrint.setBounds(300, 140, 80, 30);

        // Add all components to the Applet
        add(one);   add(tf1);
        add(two);   add(tf2);
        add(three); add(tf3);
        add(btnSubmit);
        add(btnClear);
        add(btnExit);
        add(btnPrint);
    }

    public static void main(String[] args) {
        AppletButton appletButton = new AppletButton();

    }
}
