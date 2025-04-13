package AppletProgram;

import java.applet.Applet;
import java.awt.*;

public class AppletDemo extends Applet {
    public void init() {
        // Set layout to FlowLayout
        setLayout(new FlowLayout());

        // Create AWT labels
        Label one = new Label("ONE");
        Label two = new Label("TWO");
        Label three = new Label("THREE");

        // Add labels to applet
        add(one);
        add(two);
        add(three);
    }
}


