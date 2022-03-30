package blutalkoholrechner;


import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setVisible(true);
        setPreferredSize(new Dimension(700, 250));
        setLocationRelativeTo(null);
        setTitle("Blutalkoholrechner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inhalt setzen
        var anzeige = new Blutalkohol();
        JPanel anzuzeigendesPanel=anzeige.getRootPanel();
        setContentPane(anzuzeigendesPanel);

        pack();
    }
}
