package Gui_Proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Segunda_Ventana  {
    private JPanel mainPanel;
    private JButton iniciarButton;
    public Segunda_Ventana() {
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleccion_H_o_A eleccion = new Eleccion_H_o_A();
                eleccion.setVisible(true);
                eleccion.setLocationRelativeTo(null);
                eleccion.pack();

            }
        });
    }
}
