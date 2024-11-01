package Gui_Proyecto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_H {
    private JPanel panel1;
    private JTextField txtSentenceH;
    private JTextField txtNameP;
    private JTextField txtAgeHero;
    private JComboBox cmbLevelP;
    private JButton guardarButton;
    private JButton volverButton;
    private JTextField txtNameA;
    private JTextField txtAgeA;
    private JTextField txtCountryA;
    private JTextField txtNamePe;
    private JTextField txtAgeP;
    private JTextField txtPersonaje;
    private JComboBox cmbTypeP;
    private JTextField txtnamehero;
    private JTextArea DescriptionH;
    private JButton limpiarButton;

    public Form_H() {

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSentenceH.setText("");
                txtNameP.setText("");
                txtAgeHero.setText("");
                txtNameA.setText("");
                txtCountryA.setText("");
                txtNamePe.setText("");
                txtAgeP.setText("");
                txtAgeHero.setText("");
                txtPersonaje.setText("");
                txtCountryA.setText("");
                cmbLevelP.setSelectedIndex(0);
                cmbTypeP.setSelectedIndex(0);
            }
        });
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleccion_H_o_A v = new Eleccion_H_o_A ();
                v.setVisible(true);
                v.setLocationRelativeTo(null);
                v.setSize(1980,1080);
            }
        });
    }
}
