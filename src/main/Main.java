/*
 * 
 * 
 * 
 */
package main;

import GUI.*;
import GUI.ViewDatabase;
import Inventary.Inventary;
import Structures.Wall;
import javax.swing.JFrame;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Main {
public static Inventary i = new Inventary();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Global.setInicio();

    /**
     *
     */
    
        JFrame login = new Login();
        login.setVisible(true);
        
        /*JFrame g = new GOver();
        g.setVisible(true);*/
        //
    }
    
}
