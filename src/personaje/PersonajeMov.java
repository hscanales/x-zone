/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

import GUI.GO1;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author MaPache
 */
public class PersonajeMov extends Thread {
    
    JLabel personaje;
    Personaje xander;
    int WIDTH = 30, HEIGHT = 50;
    int contr = 1, contl = 1, contu = 1, contd = 1;
    
    
    public PersonajeMov(Personaje p){
        if(GO1.flag){
            //personaje = GO1.player;
            xander = p;
            System.out.println("");
        }
    }
    
    @Override
    public void run(){
        addKeyListener(new TAdapter());
    }
    
    private class TAdapter extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent e) {
            /*Disparo disparar = new Disparo(m, n, bala1, 10, 1);
            int difx = (int) Math.sqrt(Math.pow(m.getX()-n.getX(), 2));
            int dify = (int) Math.sqrt(Math.pow(m.getY()-n.getY(), 2));*/
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_LEFT) {
                if (personaje.getX() >= 10 && personaje.getX() < 800) {
                    //if((m.getX()-30 > n.getX() || m.getX() < n.getX()) || dify >= 30){
                    personaje.setIcon(new ImageIcon(getClass().getResource("Left"+contl+".png")));
                    personaje.setLocation(personaje.getX() - 10, personaje.getY());
                    personaje.setIcon(new ImageIcon(getClass().getResource("Left.png")));
                    contl++;
                    if(contl == 3){
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
                if (personaje.getX() >= 0 && personaje.getX() <= 740) {
                    //if((m.getX()+30 < n.getX() || m.getX() > n.getX()) || dify >= 30){
                    personaje.setIcon(new ImageIcon(getClass().getResource("Right"+contr+".png")));
                    personaje.setLocation(personaje.getX() + 10, personaje.getY());
                    personaje.setIcon(new ImageIcon(getClass().getResource("Right.png")));
                    contr++;
                    if(contr == 3){
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
                if (personaje.getY() >= 10 && personaje.getY() < 500) {
                    //if((m.getY()-30 > n.getY() || m.getY() < n.getY()) || difx >= 30){
                        personaje.setIcon(new ImageIcon(getClass().getResource("Up"+contu+".png")));
                        personaje.setLocation(personaje.getX(), personaje.getY() - 10);
                        personaje.setIcon(new ImageIcon(getClass().getResource("Up.png")));
                        contu++;
                        if(contu == 3){
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
                if (personaje.getY() >= 0 && personaje.getY() <= 425) {
                    //if((m.getY()+30 < n.getY() || m.getY() > n.getY()) || difx >= 30){
                        personaje.setIcon(new ImageIcon(getClass().getResource("Down"+contd+".png")));
                        personaje.setLocation(personaje.getX(), personaje.getY() + 10);
                        personaje.setIcon(new ImageIcon(getClass().getResource("Down.png")));
                        contd++;
                        if(contd == 3){
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
