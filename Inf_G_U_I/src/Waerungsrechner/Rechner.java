package Waerungsrechner;

import Rabattrechner.WindowComponent;

import javax.swing.*;
import java.awt.*;

public class Rechner extends JFrame {

    public Rechner(){

        setVisible(true);
        setPreferredSize(new Dimension(700, 250));
        setLocationRelativeTo(null);
        setTitle("Währungsrechner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var anzeige = new Waerungsrechner();
        JPanel anzuzeigendesPanel=anzeige.getRootPanel();
        setContentPane(anzuzeigendesPanel);

        pack();

    }


}
