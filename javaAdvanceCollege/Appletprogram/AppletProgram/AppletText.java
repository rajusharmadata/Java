package AppletProgram;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="AppletText" width=400 height=200>
</applet>
*/

public class AppletText extends Applet {
    public void init() {
        // Disable layout manager
        setLayout(null);

        // Create Labels
        Label one = new Label("ONE:");
        Label two = new Label("TWO:");
        Label three = new Label("THREE:");

        // Create TextFields
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();

        // Set bounds for Labels
        one.setBounds(30, 30, 80, 20);
        two.setBounds(30, 60, 80, 20);
        three.setBounds(30, 90, 80, 20);

        // Set bounds for TextFields
        tf1.setBounds(120, 30, 150, 20);
        tf2.setBounds(120, 60, 150, 20);
        tf3.setBounds(120, 90, 150, 20);

        // Add components to Applet
        add(one);
        add(tf1);
        add(two);
        add(tf2);
        add(three);
        add(tf3);
    }
}