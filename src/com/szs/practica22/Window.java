package com.szs.practica22;

import javax.swing.JFrame;

public class Window  extends JFrame {
    private static final long serialVersionUID = 1L;

    public Window() {
        super("Window");
        setSize(700, 550);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Panel panel1 = new Panel();

        this.add(panel1);
    }
}
