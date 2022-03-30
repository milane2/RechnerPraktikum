package Taschenrechner;

import javax.swing.*;

public class Taschenrechner {

    private JPanel rootPanel;
    private JTextField display;
    private JButton Buttonnr1;
    private JButton Buttonnr2;
    private JButton Buttonnr3;
    private JButton Buttonnr4;
    private JButton Buttonnr5;
    private JButton Buttonnr6;
    private JButton Buttonnr7;
    private JButton Buttonnr8;
    private JButton Buttonnr9;
    private JButton Buttonnr0;

    private JButton ButtonPlus;
    private JButton ButtonMinus;
    private JButton ButtonMal;
    private JButton ButtonErgebnis;
    private JButton ButtonGeteielt;


    public Taschenrechner(){
        Buttonnr0.addActionListener(e -> numberPress(0));
        Buttonnr1.addActionListener(e -> numberPress(1));
        Buttonnr2.addActionListener(e -> numberPress(2));
        Buttonnr3.addActionListener(e -> numberPress(3));
        Buttonnr4.addActionListener(e -> numberPress(4));
        Buttonnr5.addActionListener(e -> numberPress(5));
        Buttonnr6.addActionListener(e -> numberPress(6));
        Buttonnr7.addActionListener(e -> numberPress(7));
        Buttonnr8.addActionListener(e -> numberPress(8));
        Buttonnr9.addActionListener(e -> numberPress(9));

        ButtonPlus.addActionListener(e -> pressCalcSign("+") );
        ButtonMal.addActionListener(e -> pressCalcSign("*"));
        ButtonMinus.addActionListener(e -> pressCalcSign("-"));
        ButtonGeteielt.addActionListener(e -> pressCalcSign("/"));
      //  ButtonErgebnis.addActionListener(e -> ergebnis());
    }

    private void numberPress(int i) {
        String currentDisplay = this.display.getText();
        display.setText(currentDisplay+Integer.toString(i));

    }
    public  void pressCalcSign(String s){

        display.setText(s);
    }
    public JPanel getRootPanel() {
        return this.rootPanel;
    }

    public void geteilt(){


    }
    public void plus(){
      // if(pressCalcSign == "+";)
        //
        //
        //
//array =temp
        //plus
        //hoch zu nummberPress

    }
    public void minus(){

    }
    public void mal() {

    }
    public void ergebnis(){


    }
}

