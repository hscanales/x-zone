/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemigo.Movimiento;

import Enemigo.Enemigo;
import Enemigo.Jefe;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import personaje.Personaje;

/**
 *
 * @author MaPache
 */
public class JefeMov extends Thread{
    
    JLabel jefe, player, bala;
    Personaje xander;
    Jefe Loffy;
    Enemigo enemy;
    private int contr = 1, contl = 1, contd = 1, contu = 1;
    private int difx, dify;
    public int d;
    
    public JefeMov(JLabel jefe, JLabel player, JLabel bala, Personaje xander){
        this.jefe = jefe;
        this.player = player;
        this.bala = bala;
        this.xander = xander;
        this.enemy = enemy;
        Loffy = new Jefe();
        Loffy.CrearEnemigo();
        enemy = Loffy.getEnemigo();
    }
    
    @Override
    public void run(){
        Disparar disparo = new Disparar(jefe,player, bala, xander, enemy);
        disparo.start();
        while(true){
            System.out.println("");
            if(jefe.getX() < player.getX()){
                for(int i = jefe.getX(); i <= player.getX(); i += 10){
                    SetDif();
                    if(((jefe.getX()+30 < player.getX()) || dify >= 30) && disparo.flag){
                        d = 1;
                        jefe.setIcon(new ImageIcon(getClass().getResource("ERight.png")));
                        this.jefe.setLocation(i, jefe.getY());
                        try {
                            sleep(75);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        disparo.setD(1);
                    }
                }
            }
            if(jefe.getX() > player.getX()){
                for(int i = jefe.getX(); i >= player.getX(); i -= 10){
                    dify = (int) Math.sqrt(Math.pow(jefe.getY()-player.getY(), 2));
                    if(((jefe.getX()-30 > player.getX()) || dify >= 30) && disparo.flag){
                        jefe.setIcon(new ImageIcon(getClass().getResource("ELeft.png")));
                        this.jefe.setLocation(i, jefe.getY());
                        int x = i;
                        try {
                            sleep(75);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        disparo.setD(2);
                    }
                }
            }
            if(jefe.getY() < player.getY()){
                for(int j = jefe.getY(); j <= player.getY(); j += 10){
                    difx = (int) Math.sqrt(Math.pow(jefe.getX()-player.getX(), 2));
                    if(((jefe.getY()+30 < player.getY()) || difx >= 30) && disparo.flag){
                        jefe.setIcon(new ImageIcon(getClass().getResource("EDown.png")));
                        this.jefe.setLocation(jefe.getX(), j);
                        int y = j;
                        try {
                            sleep(75);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        disparo.setD(4);
                    }
                }
            }
            if(jefe.getY() > player.getY()){
                for(int j = jefe.getY(); j >= player.getY(); j -= 10){
                    difx = (int) Math.sqrt(Math.pow(jefe.getX()-player.getX(), 2));
                    if(((jefe.getY()-30 > player.getY()) || difx >= 30) && disparo.flag){
                        jefe.setIcon(new ImageIcon(getClass().getResource("EUp.png")));
                        this.jefe.setLocation(jefe.getX(), j);
                        int y = j;
                        try {
                            sleep(75);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        disparo.setD(3);
                    }
                }
            }
        }
    }
    
    public int Caminando(int cont){
        cont++;
        if(cont == 4){
            cont = 1;
        }
        return cont;
    }
    
    public void SetDif(){
        difx = (int) Math.sqrt(Math.pow(jefe.getX()-player.getX(), 2));
        dify = (int) Math.sqrt(Math.pow(jefe.getY()-player.getY(), 2));
    }
    
}
