/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Joshua
 */
public class GO extends JFrame {
    
    public JLabel payer;
    
    public GO(){
        super("Pantalla de Inicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(1080,720);
        this.setLocationRelativeTo(null);
    }
}
