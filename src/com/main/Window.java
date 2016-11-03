package com.main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jaśko on 2016-11-03.
 */
public class Window extends JFrame {

    public Window(){

        Container c = this.getContentPane();

        c.add(new InvoiceTemplate());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Generator Faktur - Transkomat");
        setSize(560,700); //TODO: Set default window size to full screen
        setVisible(true);
    }
}
