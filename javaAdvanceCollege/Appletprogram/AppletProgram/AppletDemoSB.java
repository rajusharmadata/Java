package AppletProgram;
import java.applet.Applet;
import java.awt.*;



public class AppletDemoSB extends Applet {
    public void init() {
        // Disable layout manager
        setLayout(null);

        // Create AWT labels
        Label one = new Label("ONE");
        Label two = new Label("TWO");
        Label three = new Label("THREE");

        // Set bounds: (x, y, width, height)
        one.setBounds(30, 30, 100, 20);
        two.setBounds(30, 60, 100, 20);
        three.setBounds(30, 90, 100, 20);

        // Add labels to applet
        add(one);
        add(two);
        add(three);
    }
}

/*
Add on html part 
<applet code="AppletDemoSB.class" width=400 height=200>
</applet>
*/