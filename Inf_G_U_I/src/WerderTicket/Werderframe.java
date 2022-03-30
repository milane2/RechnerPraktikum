package WerderTicket;

import javax.swing.*;
import java.awt.*;

public class Werderframe extends JFrame {

    public Werderframe(){

        setVisible(true);
        setPreferredSize(new Dimension(500,400));
        setTitle("Werder-Rechner");
        WerderRechner comp = new WerderRechner();
        setContentPane(comp.getRootpanel());
        pack();
    }
}
