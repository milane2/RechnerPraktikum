package Taschenrechner;



import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setVisible(true);
        setPreferredSize(new Dimension(500, 300));
        setLocationRelativeTo(null);
        setTitle("Taschenrechner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var anzeige = new Taschenrechner();
        JPanel anzuzeigendesPanel=anzeige.getRootPanel();
        setContentPane(anzuzeigendesPanel);

        pack();
    }
}
