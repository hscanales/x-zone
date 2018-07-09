/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Inventary.Inventary;
import Items.Item;
import Items.ItemFactory;
import java.awt.Color;
import java.awt.Container;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
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
    public JLabel fondo,lblF1, lblF2,lblF3,lblF4,lblF5,lblF6;
    public JLabel button,button2;
    public JButton out;
    private Inventary Inventa;
    ArrayList<JButton> A = new ArrayList<>();

    public InventaryGui(){
        super("Inventario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(720,480);
        this.setLocationRelativeTo(null);
        setLabels();
        out = new JButton("Regresar");
        out.setBounds(620, 10, 90, HEIGHTB);
        out.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        button = new JLabel("heal");
        button.setBounds(10, 400, WIDTHB, HEIGHTB);
        
       // button.setIcon(new ImageIcon(getClass().getResource("/recursos/box.png")));
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
//            Crea objeto de prueba a agregar
            System.out.print("dsad");
                
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            ItemFactory g = new ItemFactory();
            
            Item l =g.itemCreator("heal");
                Inventa.addObject1(l);    
                updateInventaryIcons();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.print("dsad"); }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.print("dsad");}

            @Override
            public void mouseExited(MouseEvent e) {
               System.out.print("dsad");}
        });
        button2 = new JLabel("key");
        button2.setBounds(200, 400, WIDTHB, HEIGHTB);
        
      //  button2.setIcon(new ImageIcon(getClass().getResource("/recursos/box.png")));
        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
//            Crea objeto de prueba a agregar
            System.out.print("dsad");
                
                
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            ItemFactory g = new ItemFactory();
            
            Item l =g.itemCreator("key");
                Inventa.addObject1(l);    
                updateInventaryIcons();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.print("dsad"); }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.print("dsad");}

            @Override
            public void mouseExited(MouseEvent e) {
               System.out.print("dsad");}
        });
        addComponents();
        updateInventaryIcons();
        setLayout(null);
        Inventa= new Inventary();
        
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }
    /*
    Crea los botones del inventario
    */
    public void inventaryFill(){

               Container ButtonL;
        ButtonL = getContentPane();
        
        for(int i = 0;i<5;i++ ){
            
            JButton g = new JButton(""+(i));
            JLabel d = new JLabel();
            d.setBounds(50, 100, WIDTHB, HEIGHTB);
            g.setIcon(new ImageIcon(getClass().getResource("/recursos/box.png")));
            g.setBorderPainted(false);
             
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
                updateInventaryIcons();
            }
                    
                });
        menu.add("DROP OBJECT").addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ak) {
                try{
                Inventa.DropObject(Inventa.getObject(foo));    
                }
                catch(Exception e){
                    System.out.print("No hay objeto a eliminar");
                }
                updateInventaryIcons();
                
            }
                    
                });
    
               
           menu.show(g, g.getWidth()/2, g.getHeight()/2);
           updateInventaryIcons();
           }

               
            });
           
           // agrega botton actual
         //  g.setVisible(false);
         this.A.add(g);
            ButtonL.add(g);
          // ButtonL.add(d);
          
        }
}
        
    



    public void setLabels(){
        fondo = new JLabel();
        fondo.setBounds(0, 0, 720, 480);
        fondo.setIcon(new ImageIcon(getClass().getResource("/recursos/fondoMenu.png")));
        
        lblF1 = new JLabel("Inventary");
        lblF1.setBounds(80, 10, WIDTHTF, HEIGHTB);
        lblF1.setFont(new java.awt.Font("Arial", 1, 22));
        lblF1.setForeground(Color.white);
        lblF2 = new JLabel("Object no 1:");
        lblF2.setBounds(50, 40, WIDTHB, HEIGHTB);
        lblF2.setFont(new java.awt.Font("Arial", 1, 13));
        lblF2.setForeground(Color.white);
        
        lblF3 = new JLabel("Object no 2:");
        lblF3.setBounds(50+100, 40, WIDTHB, HEIGHTB);
        lblF3.setFont(new java.awt.Font("Arial", 1, 13));
        lblF3.setForeground(Color.white);
        lblF4 = new JLabel("Object no 3:");
        lblF4.setBounds(50+100*2, 40, WIDTHB, HEIGHTB);
        lblF4.setFont(new java.awt.Font("Arial", 1, 13));
        lblF4.setForeground(Color.white);
        lblF5 = new JLabel("Object no 4:");
        lblF5.setBounds(50+100*3, 40, WIDTHB, HEIGHTB);
        lblF5.setFont(new java.awt.Font("Arial", 1, 13));
        lblF5.setForeground(Color.white);
        lblF6 = new JLabel("Object no 5:");
        lblF6.setBounds(50+100*4, 40, WIDTHB, HEIGHTB);
        lblF6.setFont(new java.awt.Font("Arial", 1, 13));
        lblF6.setForeground(Color.white);
    }
    public void updateInventaryIcons(){
        int cont =  0; 
        for(JButton Jactual: this.A){
            try{
             Jactual.setIcon(new ImageIcon(Inventa.getObject(cont).get()));
                
            }
            catch(Exception e){
                System.out.print("failed");
                Jactual.setIcon(new ImageIcon(getClass().getResource("/recursos/box.png")));
            }
             cont++;
        }
    }
    public void addComponents(){
        add(button);
        add(button2);
        add(lblF1);
        add(lblF2);
         add(lblF3);
          add(lblF4);
           add(lblF5);
            add(lblF6);
            inventaryFill();
            add(fondo);
            add(out);
    }
            
}
