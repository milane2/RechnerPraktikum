package Handwerker;

import javax.swing.*;

public class Handwerker {
    private JTextField textDurchfuehrungszeit;
    private JRadioButton radioButtonArbeit;
    private JRadioButton radioButtonUeberSt;
    private JTextField textMaterial;
    private JTextField textEntfernung;
    private JTextField textNetto;
    private JTextField textMehrwert;
    private JTextField textBrutto;
    private JButton buttonRechnen;
    private JPanel rootPanel;
    private JComboBox comboBoxRolle;

    public Handwerker(){
        buttonRechnen.addActionListener(e-> berechnen());
    }
    public  int gehalt(){
        if (comboBoxRolle.getSelectedItem().equals("Meister")) {
            return 60;
        } else if (comboBoxRolle.getSelectedItem().equals("Geselle")) {
            return 40;
        }else return 20;
    }

    public double ueberstunde(){
        int zuschuss;
        zuschuss = gehalt()/2;
        return  zuschuss;

    }

    public JPanel getRootPanel() {
        return this.rootPanel;
    }

    public void berechnen(){
        int gehalt=gehalt();

        boolean ueberstunden = radioButtonUeberSt.isSelected();// Not used
        int durchfuehrungszeit = Integer.parseInt(textDurchfuehrungszeit.getText());
        int materialkosten = Integer.parseInt(textMaterial.getText());
        int entfernung = Integer.parseInt(textEntfernung.getText());

        double brutto;
        double netto;
        double fahrkosten;
        double stlohn;


        // Gehalt von der Dauer
        stlohn= durchfuehrungszeit*gehalt;

        // Kosten der Fahrt
        fahrkosten= entfernung*0.5;

        if(radioButtonUeberSt.isSelected()) {
            netto = fahrkosten + stlohn + ueberstunde() + materialkosten;
        } else {
            netto = fahrkosten + stlohn + materialkosten;
        }

        double mwst;
        mwst = netto * 1.19;

        brutto= netto+mwst;
        textNetto.setText(Double.toString(netto));
        textBrutto.setText(Double.toString(brutto));
        textMehrwert.setText(Double.toString(mwst));
    }
}
