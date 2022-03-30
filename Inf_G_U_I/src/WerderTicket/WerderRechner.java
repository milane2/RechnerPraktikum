package WerderTicket;

import javax.swing.*;

public class WerderRechner {
    private JPanel rootpanel;
    private JRadioButton radioButtonBundesliga;
    private JRadioButton radioButtonPokal;
    private JCheckBox checkBoxSchueler;
    private JComboBox comboBoxKategorie;
    private JTextField textFieldAnzahlTickets;
    private JButton buttonEnde;
    private JButton buttonTestdaten;
    private JButton buttonNeu;
    private JButton buttonBerechnen;
    private JTextField textFieldNetto;
    private JTextField textFieldMwSt;
    private JTextField textFieldBrutto;

    public JPanel getRootpanel() {
        return rootpanel;
    }


    public WerderRechner(){
        buttonBerechnen.addActionListener(e-> berechnen());
        buttonNeu.addActionListener(e-> leeren());
        buttonTestdaten.addActionListener(e -> testdaten());
        buttonEnde.addActionListener(e -> ende());
        //comboBoxKategorie.setEnabled(false);
    }
    private double Preis(){
        if (radioButtonBundesliga.isSelected()) {
            comboBoxKategorie.setEnabled(true);
        }
        if (comboBoxKategorie.getSelectedItem().equals("Kategorie A")){
            return 15;
        }else if (comboBoxKategorie.getSelectedItem().equals("Kategorie B")){
            return 20;
        }else {
            return 25;
        }
    }

    private void ende(){
        System.exit(0);
    }
    private void testdaten(){
        textFieldAnzahlTickets.setText("5");
        comboBoxKategorie.setSelectedItem("Kategorie C");
        checkBoxSchueler.setSelected(true);
        radioButtonPokal.setSelected(true);
        radioButtonBundesliga.setSelected(false);
    }

    public  String leer = null;

    private void  leeren(){
        textFieldAnzahlTickets.setText(leer);
        comboBoxKategorie.setSelectedItem("Bitte wählen");
        radioButtonBundesliga.isSelected();
        radioButtonPokal.isSelected();
        textFieldNetto.setText(leer);
        textFieldMwSt.setText(leer);
        textFieldBrutto.setText(leer);
        checkBoxSchueler.setSelected(false);
        radioButtonBundesliga.setSelected(false);
       radioButtonPokal.setSelected(false);
    }
    private void berechnen(){
        double preis = Preis();
        double netto;
        double pPreise = 22;
        double rabatte;

        boolean bundesliga = radioButtonBundesliga.isSelected();
        boolean pokal = radioButtonPokal.isSelected();
        boolean rabatt = checkBoxSchueler.isSelected();



        if (bundesliga == true){
            netto = preis;
        }
        if (pokal == true) {
            netto= pPreise;
        }


        int tickets = Integer.parseInt(textFieldAnzahlTickets.getText());
        if (tickets > 5){
            System.out.println("Zu viele ");
            JOptionPane.showMessageDialog(null,"zu viele Tickets");
        }
     //   if (rabatt == true){
        //            rabatte = (netto* 0.8;
        //        }

        boolean schueler = checkBoxSchueler.isSelected();
// rabatt

       // rabatte = (netto/100)*120;



        double mwst;
       // mwst = (netto / 100)*119;

        //Brutto
        double brutto;

       // brutto= netto + mwst;

        //boolean kindersitze = kindersitz1€CheckBox.isSelected();
        //        boolean nachtfahrt = nachtfahrtZuschlag10CheckBox.isSelected();

    }
}
