package Rabattrechner;

import javax.swing.*;

public class WindowComponent {
    private JTextField textFieldEingabe;
    private JButton rabattBerechnenButton;
    private JTextField textFieldRabatt;
    private JTextField textFieldEndbetrag;
    private JPanel rootpanel;
    private JLabel labelRabatt;


    public WindowComponent(){
        rabattBerechnenButton.addActionListener((e -> rabattBerechnen()));
    }

    private  void rabattBerechnen(){
        String eingabe = textFieldEingabe.getText();
        int betrag = Integer.parseInt(eingabe);

        if( betrag>= 1000){
            int rabatt =  betrag*5/100;
            betrag = betrag - rabatt;
            labelRabatt.setText("Sie erhalten einen Rabatt von 5%");
            textFieldRabatt.setText(Integer.toString(rabatt));
        }else {
            labelRabatt.setText("<html>Sie erhalten erst<br/> ab einen Rechnungsbetrag<br/> von 1000 € Rabatt</html>");

        }

        textFieldEndbetrag.setText(Integer.toString(betrag));

    }

    public JPanel getRootPanel() {
        return this.rootpanel;
    }
}