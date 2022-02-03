package Waerungsrechner;

import javax.swing.*;

public class Waerungsrechner {

    private JPanel rootpanel;
    private JTextField textFieldEingabe;
    private JTextField textFieldAusgabe;
    private JButton dollarButton;
    private JButton yenButton;
    private JButton pfundButton;
    private JLabel labelEndbetrag;

    public Waerungsrechner(){
       dollarButton.addActionListener((e -> DollarBerechnen()));
       yenButton.addActionListener((e -> YenBerechnen() ));
       pfundButton.addActionListener((e ->PfundBerechnen()));
    }
    public void DollarBerechnen(){
        String eingabe = textFieldEingabe.getText();
        double betrag = Integer.parseInt(eingabe);

         betrag = betrag * 1.59;
         labelEndbetrag.setText("Betrag in Dollar");
         textFieldAusgabe.setText(Double.toString(betrag));
    }
    //---------------------------------------------------------
    public void YenBerechnen(){
        String eingabe = textFieldEingabe.getText();
        double betrag = Integer.parseInt(eingabe);

        betrag = betrag * 157.38;
        labelEndbetrag.setText("Betrag in Yen");
        textFieldAusgabe.setText(Double.toString(betrag));
    }
    //---------------------------------------------------------
    public void PfundBerechnen(){
        String eingabe = textFieldEingabe.getText();
        double betrag = Integer.parseInt(eingabe);

        betrag = betrag * 0.895;
        labelEndbetrag.setText("Betrag in Pfund");
        textFieldAusgabe.setText(Double.toString(betrag));
    }
    public JPanel getRootPanel() {
        return this.rootpanel;
    }
}