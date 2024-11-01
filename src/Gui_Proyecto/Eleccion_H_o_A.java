package Gui_Proyecto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eleccion_H_o_A extends JFrame {
    private JPanel panel1;
    private JButton HÉROESButton;
    private JButton ANTIHÉROESButton;


    public Eleccion_H_o_A() {
        HÉROESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List_H list_H = new List_H();
                list_H.setVisible(true);
                list_H.pack();
                list_H.setLocationRelativeTo(null);
                list_H.setSize(1980,1080);
            }
        });
        ANTIHÉROESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List_H list_A = new List_H();
                list_A.setVisible(true);
                list_A.pack();
                list_A.setLocationRelativeTo(null);
                list_A.setSize(1980,1080);
            }
        });
    }
}
