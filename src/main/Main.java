/*
 * 
 * 
 * 
 */
package main;

import GUI.Login;
import GUI.ViewDatabase;
import Structures.Wall;
import javax.swing.JFrame;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Global.setInicio();
        JFrame login = new Login();
        login.setVisible(true);
        
    }
    
}
