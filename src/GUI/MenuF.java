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
public class MenuF extends JFrame {
    
    public MenuF(){
        EjecutarL();
    }
    
    public void EjecutarL(){
        
        add(new Menu());
        setResizable(false);
        pack();
        
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}