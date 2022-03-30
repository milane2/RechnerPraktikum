package Taxi;

import javax.swing.*;

public class Taxi {
    private JComboBox comboBoxFahrzeug;
    private JCheckBox nachtfahrtZuschlag10CheckBox;
    private JCheckBox kindersitz1€CheckBox;
    private JCheckBox barProMitfahrer15€CheckBox;
    private JTextField textFieldEntfehrnung;
    private JTextField textFieldNetto;
    private JTextField textFieldMehrwertsteuer;
    private JTextField textFieldBrutto;
    private JPanel RootPanel;
    private JTextField textFieldANzahlMitfahrer;
    private JButton buttonBerechnen;
    private JButton buttonNeu;
    private JTextField textFieldZuschlag;


    public  String leer = null;

    public Taxi(){
        buttonBerechnen.addActionListener(e-> berechnen());
        buttonNeu.addActionListener(e-> leeren());
    }

    public void leeren() {
        textFieldNetto.setText(leer);
        textFieldMehrwertsteuer.setText(leer);
        textFieldBrutto.setText(leer);
        textFieldEntfehrnung.setText(leer);
        textFieldANzahlMitfahrer.setText(leer);
    }

    public JPanel getRootPanel() {
        return this.RootPanel;
    }
    public  double fahrzeug(){
        if (comboBoxFahrzeug.getSelectedItem().equals("Großraumtaxi (1€)")) {
            return 1;
        } else if (comboBoxFahrzeug.getSelectedItem().equals("Strechlimousine (2€)")) {
            return 2;
        }else
            return 0.5;
    }

    public void berechnen() {
        double anfahrtspauschale = 3.90;
        double fahrzeug = fahrzeug();
        //Wegpreis
        double entfehrnung = Double.parseDouble(textFieldEntfehrnung.getText());

        double wegpreis;
        wegpreis = entfehrnung * fahrzeug;

        //Nachtfahrt
        double nachtfahrtpreis;
        nachtfahrtpreis = 10 * (anfahrtspauschale + wegpreis) / 100;

        //Optionla todo
        textFieldZuschlag.setText(Double.toString(nachtfahrtpreis));
        //Kindersitz
        int kindersitz = 1;

        //Bar
        int anzahlpersonen = Integer.parseInt(textFieldANzahlMitfahrer.getText());
        int barpreis = anzahlpersonen * 15;


        //Netto
        double netto;
        netto= wegpreis;

        boolean kindersitze = kindersitz1€CheckBox.isSelected();
        boolean nachtfahrt = nachtfahrtZuschlag10CheckBox.isSelected();
        boolean barpreise = barProMitfahrer15€CheckBox.isSelected();

        if (kindersitze == true){
            netto = netto + kindersitz;
        }
        if (nachtfahrt == true) {
            netto= netto + nachtfahrtpreis;
        }
        if (barpreise == true){
            netto = netto + barpreis;
        }

        if (barpreise && nachtfahrt && kindersitze != true){
            netto= netto;
        }

        // Mehrrwertsteuer
        double mwst;
        mwst = (netto / 100)*107;

        //Brutto
        double brutto;
        brutto = mwst + netto;

        textFieldNetto.setText(Double.toString(netto));
        textFieldMehrwertsteuer.setText(Double.toString(mwst));
        textFieldBrutto.setText(Double.toString(brutto));
    }
}

// if (nachtfahrtZuschlag10CheckBox.isSelected() ||
//                kindersitz1€CheckBox.isSelected() || barProMitfahrer15€CheckBox.isSelected()) {
//            netto = wegpreis + nachtfahrt + kindersitz + barpreis;
//
//        } else if (kindersitz1€CheckBox.isSelected()||barProMitfahrer15€CheckBox.isSelected()){
//            netto = wegpreis+ kindersitz+ barpreis;
//
//        }else if (nachtfahrtZuschlag10CheckBox.isSelected()||barProMitfahrer15€CheckBox.isSelected()){
//            netto = wegpreis + nachtfahrt+ barpreis;
//
//        }else if (nachtfahrtZuschlag10CheckBox.isSelected()|| kindersitz1€CheckBox.isSelected()){
//            netto = wegpreis +nachtfahrt +kindersitz;
//
//        }else if (nachtfahrtZuschlag10CheckBox.isSelected()){
//            netto = wegpreis+ nachtfahrt;
//
//        } else if (kindersitz1€CheckBox.isSelected()){
//            netto= wegpreis+ kindersitz;
//
//        } else if (barProMitfahrer15€CheckBox.isSelected()){
//            netto= wegpreis+ barpreis;
//
//        } else{
//            netto = wegpreis;
//        }