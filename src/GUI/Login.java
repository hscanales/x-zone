/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

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
    public String user,us;
    
    public Login(){
        us = Eventos();
    }
    
    private String Eventos(){
        textF1 = new JTextField();
        textF1.setBounds(120, 110, WIDTHTF, HEIGHTTF);
        lblF1 = new JLabel("Bienvenido a X-Zone");
        lblF1.setBounds(80, 30, WIDTHTF, HEIGHTB);
        lblF2 = new JLabel("Usuario");
        lblF2.setBounds(50, 110, WIDTHB, HEIGHTB);
        textF1.setEditable(true);
        button = new JButton("Entrar al juego");
        button.setBounds(new Rectangle(120,150,80,20));
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                user= textF1.getText();
                JFrame menu = new MenuF();
                menu.setVisible(true);
                setVisible(false);
                JComponent comp = (JComponent) arg0.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                win.dispose();
            }
        });
        add(textF1);
        add(lblF1);
        add(lblF2);
        add(button);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        return user;
    }
}
