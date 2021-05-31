package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter extends JFrame implements ActionListener {

    private final JButton CtoF;
    private final JButton FtoCBTN;
    private final JTextField fahrenheitTF;
    private final JTextField celsjuszTF;

    public Converter() {
        super("Converter");
        celsjuszTF = new JTextField("0");
        fahrenheitTF = new JTextField("32");
        CtoF = new JButton("C -> F");
        CtoF.addActionListener(this);
        FtoCBTN = new JButton("F -> C");
        FtoCBTN.addActionListener(this);

        JPanel p1 = new JPanel(new GridLayout(2, 2));
        p1.add(celsjuszTF);
        p1.add(new JLabel("Celcius"));
        p1.add(fahrenheitTF);
        p1.add(new JLabel("Fahrenheit"));

        JPanel p2 = new JPanel(new GridLayout(1, 2));
        p2.add(CtoF);
        p2.add(FtoCBTN);

        JPanel p3 = new JPanel(new BorderLayout());
        p3.add(p1, BorderLayout.NORTH);
        p3.add(p2, BorderLayout.SOUTH);

        setContentPane(p3);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(200, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == CtoF) {
            double tempFahrenheit = Double.parseDouble(celsjuszTF.getText()) * 1.8 + 32;
            fahrenheitTF.setText(Double.toString(tempFahrenheit));
        }

        if (e.getSource() == FtoCBTN) {
            double tempCelsius = (Double.parseDouble(fahrenheitTF.getText()) - 32) * 0.555;
            celsjuszTF.setText(Double.toString(tempCelsius));

        }
    }
}