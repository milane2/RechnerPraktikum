package Taxi;



import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setVisible(true);
        setPreferredSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setTitle("Taxirechner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var anzeige = new Taxi();
        JPanel anzuzeigendesPanel=anzeige.getRootPanel();
        setContentPane(anzuzeigendesPanel);

        pack();
    }

}
