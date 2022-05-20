package Evelyn.com.ui;

import javax.swing.*;
import java.awt.*;

public class MyWin {
    public static void main(String[] args) {
        //swing,SWT,JavaFX
        //extension
        JFrame frame = new JFrame();
       frame.setSize(600,400);
       frame.setLocation(300,200);
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       //add Component
        JButton button = new JButton("OK");
        //暱稱類別,Anonymous class
       // MyActionListener listener = new MyActionListener();
        //button.addActionListener(listener);
        //Layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);

        frame.setVisible(true);
        System.out.println("END？");

        System.out.println("END？");
    }

}
