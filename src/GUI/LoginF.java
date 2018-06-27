/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Joshua
 */
public class LoginF extends JFrame {
    
    public LoginF(){
        EjecutarL();
    }
    
    private void EjecutarL(){
        
        add(new Login());
        setResizable(false);
        pack();
        
        setTitle("Pantalla de Inicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
