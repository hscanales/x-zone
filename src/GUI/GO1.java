/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import personaje.Personaje;
import personaje.PersonajeMov;
import personaje.Xander;

/**
 *
 * @author Joshua
 */
public class GO1 extends JFrame {
    
    public JLabel personaje;
    public JLabel fondo;
    public int WIDHTP = 30, HEIGHTP = 50;
    int contr = 1, contl =1, contu = 1, contd = 1;
    public Personaje Xander;
    public Xander jugador = new Xander();
    public static boolean flag;
    
    public GO1(){
        super("Nivel 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(1080,720);
        this.setLocationRelativeTo(null);
        Formulario();
        addKeyListener(new TAdapter());
        Container container = getContentPane();
        container.add(personaje);
        container.add(fondo);
        flag = this.getFocusableWindowState();
    }
    
    public void Formulario(){
        jugador.crearPersonaje();
        Xander = jugador.getPersonaje();
        
        personaje = new JLabel();
        personaje.setBounds(50, 570, WIDHTP, HEIGHTP);
        personaje.setIcon(new ImageIcon(getClass().getResource("/recursos/Right1.png")));
        Xander.setPlayer(personaje);
        
        fondo = new JLabel();
        fondo.setBounds(0, 0, 1080, 720);
        fondo.setIcon(new ImageIcon(getClass().getResource("/recursos/Mpa1.jpg")));
        
        
    }
    
    private class TAdapter extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent e) {
            /*Disparo disparar = new Disparo(m, n, bala1, 10, 1);
            int difx = (int) Math.sqrt(Math.pow(m.getX()-n.getX(), 2));
            int dify = (int) Math.sqrt(Math.pow(m.getY()-n.getY(), 2));*/
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT) {
                if (personaje.getX() >= 10 && personaje.getX() < 1050) {
                    //if((m.getX()-30 > n.getX() || m.getX() < n.getX()) || dify >= 30){
                    personaje.setIcon(new ImageIcon(getClass().getResource("/recursos/Left"+contl+".png")));
                    personaje.setLocation(personaje.getX() - 10, personaje.getY());
                    contl++;
                    if(contl == 5){
                        contl = 1;
                    }
                    /*right = false;
                    left = true;
                    up = false;
                    down = false;*/
                    //}
                }
            }
            if (key == KeyEvent.VK_RIGHT) {
                if (personaje.getX() >= 0 && personaje.getX() <= 1080) {
                    //if((m.getX()+30 < n.getX() || m.getX() > n.getX()) || dify >= 30){
                    
                    personaje.setIcon(new ImageIcon(getClass().getResource("/recursos/Right"+contr+".png")));
                    personaje.setLocation(personaje.getX() + 10, personaje.getY());
                    contr++;
                    if(contr == 5){
                        contr = 1;
                    }
                    /*right = true;
                    left = false;
                    up = false;
                    down = false;*/
                    //}
                }
            }
            if (key == KeyEvent.VK_UP) {
                if (personaje.getY() >= 10 && personaje.getY() < 720) {
                    //if((m.getY()-30 > n.getY() || m.getY() < n.getY()) || difx >= 30){
                    
                    personaje.setIcon(new ImageIcon(getClass().getResource("/recursos/Up"+contu+".png")));
                    personaje.setLocation(personaje.getX(), personaje.getY() - 10);
                    contu++;
                    if(contu == 5){
                        contu = 1;
                    }
                        /*right = false;
                        left = false;
                        up = true;
                        down = false;*/
                    //}
                }
            }
            if (key == KeyEvent.VK_DOWN) {
                if (personaje.getY() >= 0 && personaje.getY() <= 680) {
                    //if((m.getY()+30 < n.getY() || m.getY() > n.getY()) || difx >= 30){
                    
                    personaje.setIcon(new ImageIcon(getClass().getResource("/recursos/Down"+contd+".png")));
                    personaje.setLocation(personaje.getX(), personaje.getY() + 10);
                    contd++;
                    if(contd == 5){
                        contd = 1;
                    }
                        /*right = false;
                        left = false;
                        up = false;
                        down = true;*/
                    //}
                }
            }
            /*if(key == KeyEvent.VK_SPACE){
                if(right){
                    disparar.Setter(1);
                    disparar.start();
                }
                if(left){
                    disparar.Setter(2);
                    disparar.start();
                }
                if(up){
                    disparar.Setter(3);
                    disparar.start();
                }
                if(down){
                    disparar.Setter(4);
                    disparar.start();
                }
            }*/
        }
    }
}
