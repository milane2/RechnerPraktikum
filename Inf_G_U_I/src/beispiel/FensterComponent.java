package beispiel;

import javax.swing.*;

public class FensterComponent {

    private JPanel rootpanel;
    private JTextField textField1;
    private JButton button1;

    public FensterComponent(){
        button1.addActionListener((e -> clickBtn()));
    }
    private void clickBtn(){
        String text = textField1.getText();
        System.out.println(text);
    }

    public JPanel getRootpanel() {
        return rootpanel;
    }
}
