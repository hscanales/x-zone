/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Joshua
 */
public class Login extends JPanel {
    
    public int WIDTH = 300, WIDTHTF = 120, WIDTHB = 80;
    public int HEIGHT = 300, HEIGHTTF = 30, HEIGHTB= 30;
    public JTextField textF1;
    public JLabel lblF1, lblF2;
    public JButton button;
    
    public Login(){
        textF1 = new JTextField();
        textF1.setBounds(120, 110, WIDTHTF, HEIGHTTF);
        lblF1 = new JLabel("Bienvenido a X-Zone");
        lblF1.setBounds(80, 30, WIDTHTF, HEIGHTB);
        lblF2 = new JLabel("Usuario");
        lblF2.setBounds(50, 110, WIDTHB, HEIGHTB);
        textF1.setEditable(true);
        add(textF1);
        add(lblF1);
        add(lblF2);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }
}
