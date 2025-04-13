package Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class second extends JFrame implements ActionListener {
 TextField t1;
    TextField t2;
 JButton addButton;
 JLabel result;

 public second(){
     // write a code on main constraction
     setLayout(new FlowLayout());
     t1 = new TextField(10);
     t2 = new TextField(10);
     addButton = new JButton("Add");
     result = new JLabel("Result");
     add(t1);
     add(t2);
     add(addButton);
     add(result);
     addButton.addActionListener(this);
     setTitle("Swing Additon");
     setSize(250,250);

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
 }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
