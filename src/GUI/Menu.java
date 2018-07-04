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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author LN710Q
 */
public class Menu extends JPanel {
    public int WIDTH = 300, WIDTHTF = 120, WIDTHB = 140;
    public int HEIGHT = 300, HEIGHTTF = 30, HEIGHTB= 50;
    public JTextField textF1;
    public JLabel lblF1, lblF2;
    public JButton button, btn2, btn3;
    public String user;
    
    public Menu(){
        textF1 = new JTextField();
        textF1.setBounds(120, 110, WIDTHTF, HEIGHTTF);
        lblF1 = new JLabel("X-Zone: Lost Glory");
        lblF1.setBounds(80, 30, WIDTHTF, HEIGHTB);
        lblF2 = new JLabel("Usuario");
        lblF2.setBounds(50, 110, WIDTHB, HEIGHTB);
        textF1.setEditable(true);
        button = new JButton("Iniciar Partida");
        button.setBounds(new Rectangle(80,100,WIDTHB,HEIGHTB));
        btn2 = new JButton("Instrucciones");
        btn2.setBounds(new Rectangle(80,160,WIDTHB,HEIGHTB));
        btn3 = new JButton("Salir");
        btn3.setBounds(new Rectangle(80,220,WIDTHB,HEIGHTB));
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                setVisible(false);
                JComponent comp = (JComponent) arg0.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                win.dispose();
            }
        });
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "Colocar instrucciones aca :v", "Instrucciones",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                setVisible(false);
                JComponent comp = (JComponent) arg0.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                win.dispose();
                System.exit(0);
            }
        });
        add(lblF1);
        add(button);
        add(btn2);
        add(btn3);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }
}
