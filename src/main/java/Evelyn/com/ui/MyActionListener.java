package Evelyn.com.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class MyActionListener  implements ActionListener {
    public void actiinPerformed(ActionEvent e ){
        System.out.println("Hi");
    }

    public static class Myform {
        private JButton helloButton;
        private JTextField hiTextField;
    }
}
