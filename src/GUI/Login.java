/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Inventary.Inventary;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Joshua
 */
public class Login extends JFrame {
    
    public int WIDTH = 300, WIDTHTF = 150, WIDTHB = 80;
    public int HEIGHT = 300, HEIGHTTF = 30, HEIGHTB= 30;
    public JTextField textF1;
    public JLabel fondo;
    public JButton button;
    public static String user,us;
   // private Inventary in;
    
    public Login(){
        super("Pantalla de Inicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(720,480);
        this.setLocationRelativeTo(null);
        Formulario();
        Container container = getContentPane();
        container.add(button);
        container.add(fondo);
        container.add(textF1);
        Eventos();
    }
    
    public void Formulario(){
        fondo = new JLabel();
        fondo.setBounds(0, 0, 720, 480);
        fondo.setIcon(new ImageIcon(getClass().getResource("/recursos/fondo.png")));
        textF1 = new JTextField();
        textF1.setBounds(285, 250, WIDTHTF, HEIGHTTF);
        textF1.setEditable(true);
        button = new JButton("Empezar");
        button.setBounds(310, 300, 100, 30);
    }
    
    public String Eventos(){
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                user = textF1.getText();
                if(user.isEmpty()){
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Ingrese un Nickname para continuar", "Error de login",
                    JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    new Menu().setVisible(true);
                    setVisible(false);
                    JComponent comp = (JComponent) arg0.getSource();
                    Window win = SwingUtilities.getWindowAncestor(comp);
                    win.dispose();    
                }
            }
        });
        return user;
    }
}
