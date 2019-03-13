import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nettonabrutto {
    private JTextField textField1;
    private JRadioButton radioButtonNetBru;
    private JRadioButton radioButtonBruNet;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonCof;
    private JButton buttonRes;
    private JButton buttonBruNet;
    private JButton buttonNetBru;
    private JPanel nettonabrutto;


    double wynikNnB;
    double podatekNnB = 1.23;
    double wynikBnN;
    double podatekBnN = 1.23;



    public void NettoNaBrutto1(){
        wynikNnB = Double.parseDouble(textField1.getText()) * podatekNnB;
        textField1.setText(Double.toString(wynikNnB));
    }

    public void BruttoNaNetto1(){
        wynikBnN = Double.parseDouble(textField1.getText()) / podatekBnN;
        textField1.setText(Double.toString(wynikBnN));


    }



    public void BruttoNaNetto(){
        textField1.setEnabled(true);
        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        buttonNetBru.setEnabled(false);
        buttonBruNet.setEnabled(true);
    }

    public void NettoNaBrutto(){

        textField1.setEnabled(true);
        button0.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        buttonNetBru.setEnabled(true);
        buttonBruNet.setEnabled(false);
    }

    public nettonabrutto() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        {
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(textField1.getText() + "1");
                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(textField1.getText() + "2");
                }
            });
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(textField1.getText() + "3");
                }
            });
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(textField1.getText() + "4");
                }
            });
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(textField1.getText() + "5");
                }
            });
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(textField1.getText() + "6");
                }
            });
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(textField1.getText() + "7");
                }
            });
            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(textField1.getText() + "8");
                }
            });
            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(textField1.getText() + "9");
                }
            });
            button0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText(textField1.getText() + "0");
                }
            });
            buttonRes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText("");
                }
            });
        }
        radioButtonNetBru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NettoNaBrutto();
            }
        });
        radioButtonBruNet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BruttoNaNetto();
            }
        });
        buttonCof.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = textField1.getText().length();
                int number = textField1.getText().length() - 1;
                String store;
                if (length > 0) {
                    StringBuilder back = new StringBuilder(textField1.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    textField1.setText(store);
                }
            }
        });
        buttonBruNet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BruttoNaNetto1();
            }
        });
        buttonNetBru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NettoNaBrutto1();
            }
        });
    }public static void main(String[] args) {
        JFrame frame = new JFrame("nettonabrutto");
        frame.setContentPane(new nettonabrutto().nettonabrutto);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
