package com.szs.practica22;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;


public class Panel extends JPanel{

    private static final long serialVersionUID = 1L;
    static JTextField textFiel;

    public Panel() {
        this.setLayout(null);
        JLabel label = new JLabel("Ingresa un textto", SwingConstants.CENTER);
        label.setBounds(40, 60, 200, 30);

        label.setOpaque(true);
        label.setForeground(Color.BLUE);
        label.setBackground(Color.WHITE);
        label.setFont(new Font("Courtier", Font.ITALIC, 20));
        this.add(label);

        /*
        JTextArea areaText = new JTextArea(7, 9);
        areaText.setBounds(323, 60, 250, 70);
         */

        String profesion[] = {"Maestro", "Doctor", "Programador", "Albañil"};
        JComboBox comboBox = new JComboBox(profesion);
        comboBox.setBounds(250, 60, 200, 30);

        this.add(comboBox);
    }

}
