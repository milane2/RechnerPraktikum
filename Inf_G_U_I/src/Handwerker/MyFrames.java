package Handwerker;


import javax.swing.*;
import java.awt.*;

public class MyFrames extends JFrame {

    public MyFrames() {
        setVisible(true);
        setPreferredSize(new Dimension(500, 400));
        setLocationRelativeTo(null);
        setTitle("Handwerkerrechnung");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var anzeige = new Handwerker();
        JPanel anzuzeigendesPanel=anzeige.getRootPanel();
        setContentPane(anzuzeigendesPanel);

        pack();
    }


}
