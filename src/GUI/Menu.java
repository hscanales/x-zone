/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Joshua
 */
public class Menu extends JFrame {
    
    public int WIDTH = 300, WIDTHTF = 120, WIDTHB = 140;
    public int HEIGHT = 300, HEIGHTTF = 30, HEIGHTB= 50;
    public JTextField textF1;
    public JLabel fondo, nickname;
    public JButton btn1, btn2, btn3;
    public String user;
    
    public Menu(){
        super("Menu");
        this.user = Login.user;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(720,480);
        this.setLocationRelativeTo(null);
        Formulario();
        Container container = getContentPane();
        container.add(btn1);
        container.add(btn2);
        container.add(btn3);
        container.add(nickname);
        container.add(fondo);
        Eventos();
    }
    
    public void Formulario(){
        fondo = new JLabel();
        fondo.setBounds(0, 0, 720, 480);
        fondo.setIcon(new ImageIcon(getClass().getResource("/recursos/fondoMenu.png")));
        btn1 = new JButton("Iniciar Partida");
        nickname = new JLabel(user);
        nickname.setBounds(10, 10, 150, 30);
        nickname.setFont(new java.awt.Font("Arial", 1, 22));
        nickname.setForeground(Color.white);
        btn2 = new JButton("Instrucciones");
        btn3 = new JButton("Salir");
        btn1.setBounds(290, 110, WIDTHB, HEIGHTB);
        btn2.setBounds(290, 220, WIDTHB, HEIGHTB);
        btn3.setBounds(290, 330, WIDTHB, HEIGHTB);
    }
    
    public void Eventos(){
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                win.dispose();
                new GO().setVisible(true);
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    
}