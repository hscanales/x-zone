/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Enemigo.Movimiento.EnemigoMov;
import GUI.Mapa.MapReader;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import personaje.Personaje;
import personaje.Xander;
import java.applet.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author Joshua
 */
public class GO3 extends JFrame {
    
    public JLabel personaje, enemigo1;
    public JLabel fondo;
    //public JButton inv;
    public int WIDTHP = 32, HEIGHTP = 32;
    public int WIDTHB = 140, HEIGHTB = 50;
    public int contr = 1, contl = 1, contu = 1, contd = 1;
    public Personaje Xander;
    public Xander jugador = new Xander();
    public static boolean flag;
    ArrayList<String[]> mapa;
    public float widht = 32, height = 32;
    public float posx, posy;
    public AudioClip music;
    
    EnemigoMov emov1, emov2, emov3, emov4;
    
    public GO3() throws IOException{
        super("NIVEL 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(960,608);
        this.setLocationRelativeTo(null);
        Formulario();
        JFrame frame = new JFrame();
        music = java.applet.Applet.newAudioClip(getClass().getResource("/music/Toxicity [8 Bit Cover Tribute to System of a Down] - 8 Bit Universe.wav"));
        music.play();
        addKeyListener(new TAdapter());
        Container container = getContentPane();
        container.add(personaje);
        /*container.add(enemigo1);*/
        container.add(fondo);
        flag = this.getFocusableWindowState();
        mapa = MapReader.reader("src/GUI/Mapa/matriz3.txt");
        //emov1 = new EnemigoMov(enemigo1, personaje, 384, 480, 160, 320, Xander);
        emov1.start();
        JOptionPane.showMessageDialog(frame, "Final BOSS $6.99  \n https://www.paypal.me/hectorcanalessv \n", "DLC",
            JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void Formulario(){
        jugador.crearPersonaje();
        Xander = jugador.getPersonaje();
        
        personaje = new JLabel();
        personaje.setBounds(32, 64, WIDTHP, HEIGHTP);
        personaje.setIcon(new ImageIcon(getClass().getResource("/recursos/Down1.png")));
        Xander.setPlayer(personaje);
        
        enemigo1 = new JLabel();
        enemigo1.setBounds(384, 160, WIDTHP, HEIGHTP);
        enemigo1.setIcon(new ImageIcon(getClass().getResource("/recursos/ERight1.png")));
        //inv = new JButton();
        //inv.setBounds(920, 10, WIDTHB, HEIGHTB);
        
        fondo = new JLabel();
        fondo.setBounds(0, 0, 960, 608);
        fondo.setIcon(new ImageIcon(getClass().getResource("/recursos/Mpa3.png")));
        
        
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
                    posx = (personaje.getX())/widht;
                    posy = (personaje.getY()+16)/height;
                    if(Posicion(posx, posy)){
                        personaje.setIcon(new ImageIcon(getClass().getResource("/recursos/Left"+contl+".png")));
                        personaje.setLocation(personaje.getX() - 10, personaje.getY());
                        contl++;
                        if(contl == 4){
                            contl = 1;
                        }
                    }
                    /*right = false;
                    left = true; d=mapa.get(0)
                    up = false; d[?]
                    down = false;*/
                    //}
                }
            }
            if (key == KeyEvent.VK_RIGHT) {
                if (personaje.getX() >= 0 && personaje.getX() <= 1080) {
                    //if((m.getX()+30 < n.getX() || m.getX() > n.getX()) || dify >= 30){
                    posx = (personaje.getX()+32)/widht;
                    posy = (personaje.getY()+16)/height;
                    if(Posicion(posx,posy)){
                        personaje.setIcon(new ImageIcon(getClass().getResource("/recursos/Right"+contr+".png")));
                        personaje.setLocation(personaje.getX() + 10, personaje.getY());
                        contr++;
                        if(contr == 4){
                            contr = 1;
                        }
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
                    posx = (personaje.getX()+16)/widht;
                    posy = (personaje.getY())/height;
                    if(Posicion(posx,posy)){
                        personaje.setIcon(new ImageIcon(getClass().getResource("/recursos/Up"+contu+".png")));
                        personaje.setLocation(personaje.getX(), personaje.getY() - 10);
                        contu++;
                        if(contu == 4){
                            contu = 1;
                        }
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
                    posx = (personaje.getX()+16)/widht;
                    posy = (personaje.getY()+32)/height;
                    if(Posicion(posx,posy)){
                        personaje.setIcon(new ImageIcon(getClass().getResource("/recursos/Down"+contd+".png")));
                        personaje.setLocation(personaje.getX(), personaje.getY() + 10);
                        contd++;
                        if(contd == 4){
                            contd = 1;
                        }
                    }
                        /*right = false;
                        left = false;
                        up = false;
                        down = true;*/
                    //}
                }
            }
            if (key == KeyEvent.VK_I){
                new InventaryGui().setVisible(true);
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
    
    public boolean Posicion(float posx,float posy){
        //System.out.println(posy);
        int y = (int) Math.floor(posy);
        int x = (int) Math.floor(posx);
        String[] aux = mapa.get(y);
        if("1".equals(aux[x])){
            return true;
        }
        return false;
    }
}
