/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import main.Global;

/**
 *
 * @author Joshua
 */
public class GOver extends JFrame {
    public JLabel go,us,sc,us2,sc2;
    public JButton re, sa, ra;
    public GOver(){
        super("Game Over");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(960,608);
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);
        Tabla();
        Container container = getContentPane();
        container.add(go);
        container.add(us);
        container.add(sc);
        
        //Global.setScore();
        
        //Eventos();
    }
    
    public void Tabla(){
        go = new JLabel("GAME OVER");
        go.setFont(new java.awt.Font("Arial", 1, 60));
        go.setForeground(Color.white);
        go.setBounds(275, 10, 400, 200);
        us = new JLabel("USUARIO:");
        us.setFont(new java.awt.Font("Arial", 1, 40));
        us.setForeground(Color.white);
        us.setBounds(75, 120, 400, 200);
        sc = new JLabel("PUNTAJE:");
        sc.setFont(new java.awt.Font("Arial", 1, 40));
        sc.setForeground(Color.white);
        sc.setBounds(75, 200, 400, 200);
        us2 = new JLabel();
        sc2 = new JLabel();
        
        
        
    }

    public void Eventos() {
        
    }
    
    
}
