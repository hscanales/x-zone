/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Inventary.Inventary;
import Items.Item;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Joshua
 */
public class InventaryGui extends JFrame{
    
    public int WIDTH = 700, WIDTHTF = 120, WIDTHB = 80;
    public int HEIGHT = 700, HEIGHTTF = 30, HEIGHTB= 30;
    public JTextField textF1;
    public JLabel lblF1, lblF2,lblF3,lblF4,lblF5,lblF6;
    public JButton button;
    Inventary Inventa;

    public InventaryGui(){
        super("Pantalla de Inicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(720,480);
        this.setLocationRelativeTo(null);
        lblF1 = new JLabel("Inventary");
        lblF1.setBounds(80, 10, WIDTHTF, HEIGHTB);
        lblF2 = new JLabel("Object no 1:");
        lblF2.setBounds(50, 40, WIDTHB, HEIGHTB);
        lblF3 = new JLabel("Object no 2:");
        lblF3.setBounds(50+100, 40, WIDTHB, HEIGHTB);
        lblF4 = new JLabel("Object no 3:");
        lblF4.setBounds(50+100*2, 40, WIDTHB, HEIGHTB);
        lblF5 = new JLabel("Object no 4:");
        lblF5.setBounds(50+100*3, 40, WIDTHB, HEIGHTB);
        lblF6 = new JLabel("Object no 5:");
        lblF6.setBounds(50+100*4, 40, WIDTHB, HEIGHTB);
        button = new JButton("CREATE OBJECT1");
        button.setBounds(10, 400, WIDTHB, HEIGHTB);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                /*
                Crea objeto de prueba a agregar
                */
                
                Item l = new Item() {
                    @Override
                    public void use() {
                        System.out.print("hola");
                    }

                    @Override
                    public int get() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean isHealing() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean isKey() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public boolean itsATrap() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
                Inventa.addObject1(l);
            }
            
        });
        add(button);
        add(lblF1);
        add(lblF2);
         add(lblF3);
          add(lblF4);
           add(lblF5);
            add(lblF6);
        setLayout(null);
        Inventa= new Inventary();
        inventaryFill();
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }
    /*
    Crea los botones del inventario
    */
    public void inventaryFill(){

               
        
        for(int i = 0;i<5;i++ ){
            
            JButton g = new JButton(""+(i));
            //Inventa.addObject1(new Object1("I AM OBJECT ONE "+i));
            g.setBounds(50+i*100,100,WIDTHB,HEIGHTB);
            g.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
                   
         
           
       //System.out.println(e.getActionCommand());
           int foo = Integer.parseInt(e.getActionCommand());
          //Creacion del JPopupmenu 
           JPopupMenu menu = new JPopupMenu("Menu");
           //Agregar accion al JPopupmenu
                menu.add("USE OBJECT").addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Inventa.useObjectOfList(foo);
            }
                    
                });
        menu.add("DROP OBJECT").addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ak) {
                
                Inventa.DropObject(Inventa.getObject(foo));
            }
                    
                });
    
               
           menu.show(g, g.getWidth()/2, g.getHeight()/2);
           }

               
            });
           
           // agrega botton actual
            add(g);
        }
    }
}
