/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemigo.Movimiento;

import Enemigo.Enemigo;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import personaje.Personaje;

/**
 *
 * @author MaPache
 */
public class Disparar extends Thread{
    
    JLabel player, enemigo, bala;
    Personaje xander;
    Enemigo enemy;
    int d = 0;
    int difx, dify;
    int atk;
    int contf = 1;
    int dist = 150; 
    public boolean flag = true;
    
    public Disparar(JLabel enemigo, JLabel player, JLabel bala, Personaje xander, Enemigo enemy){
        this.enemigo = enemigo;
        this.player = player;
        this.bala = bala;
        this.xander = xander;
        this.enemy = enemy;
        this.atk = (int) enemy.getAtaque().get(0);
    }
    
    public void setD(int d){
        this.d = d;
    }
    
    @Override
    public void run(){
        while(true){
            SetDif();
            System.out.println("");
            if(d == 1){
                if((difx < dist) && dify < 30 && enemigo.getX() < player.getX()){
                    flag = false;
                    int y = enemigo.getY();
                    for(int i = enemigo.getX()+32; i < 970; i += 4){
                        SetDif();
                        bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Fuego"+contf+".png")));
                        bala.setLocation(i, y);
                        contf = Disparando(contf);
                        try {
                            sleep(20);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if(dify >= 30){
                            flag = true;
                        }
                        if(i == player.getX() && dify <= 16){
                            xander.setVida(xander.getVida()-atk);
                            System.out.println(xander.getVida());
                            bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Off.png")));
                            break;
                        }
                        if(i > 960){
                            bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Off.png")));
                            break;
                        }
                    }
                }
                if(dify >= 30 || difx >= dist){
                    flag = true;
                }
            }
            if(d == 2){
                 if((difx < dist) && dify < 30 && enemigo.getX() > player.getX()){
                    flag = false;
                    int y = enemigo.getY();
                    for(int i = enemigo.getX(); i > -10; i -= 4){
                        bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Fuego"+contf+".png")));
                        bala.setLocation(i, y);
                        contf = Disparando(contf);
                        try {
                            sleep(20);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if(dify >= 30){
                            flag = true;
                        }
                        if(i == player.getX() && dify <= 16){
                            xander.setVida(xander.getVida()-atk);
                            System.out.println(xander.getVida());
                            bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Off.png")));
                            break;
                        }
                        if(i < 0){
                            bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Off.png")));
                            break;
                        }
                    }
                }
                if(dify >= 30 || difx >= dist){
                    flag = true;
                }
            }
            if(d == 3){
                if((dify < dist) && difx < 30 && enemigo.getY() > player.getY()){
                    flag = false;
                    int x = enemigo.getX();
                    for(int i = enemigo.getY(); i > -10; i -= 4){
                        bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Fuego"+contf+".png")));
                        bala.setLocation(x, i);
                        contf = Disparando(contf);
                        try {
                            sleep(20);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if(difx >= 30){
                            flag = true;
                        }
                        if(i == player.getY() && difx <= 16){
                            xander.setVida(xander.getVida()-atk);
                            System.out.println(xander.getVida());
                            bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Off.png")));
                            break;
                        }
                        if(i < 0){
                            bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Off.png")));
                            break;
                        }
                    }
                }
                if(difx >= 30 || dify >= dist){
                    flag = true;
                }
            }
            if(d == 4){
                if((dify < dist) && difx < 30 && enemigo.getY() < player.getY()){
                    flag = false;
                    int x = enemigo.getX();
                    for(int i = enemigo.getY()+32; i < 608; i += 4){
                        bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Fuego"+contf+".png")));
                        bala.setLocation(x, i);
                        contf = Disparando(contf);
                        try {
                            sleep(20);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if(difx >= 30){
                            flag = true;
                        }
                        if(i == player.getY() && difx <= 16){
                            xander.setVida(xander.getVida()-atk);
                            System.out.println(xander.getVida());
                            bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Off.png")));
                            break;
                        }
                        if(i > 608){
                            bala.setIcon(new ImageIcon(getClass().getResource("/recursos/Off.png")));
                            break;
                        }
                    }
                }
                if(difx >= 30 || dify >= dist){
                    flag = true;
                }
            }
        }
    }
    
    public void SetDif(){
        difx = (int) Math.sqrt(Math.pow(enemigo.getX()-player.getX(), 2));
        dify = (int) Math.sqrt(Math.pow(enemigo.getY()-player.getY(), 2));
    }
    
    public int Disparando(int cont){
        cont++;
        if(cont == 4){
            cont = 1;
        }
        return cont;
    }
    
}
