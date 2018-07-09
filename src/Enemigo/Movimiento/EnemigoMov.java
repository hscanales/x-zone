/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemigo.Movimiento;

import Enemigo.Enemigo;
import Enemigo.Soldado;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import personaje.Personaje;

/**
 *
 * @author MaPache
 */
public class EnemigoMov extends Thread{
    
    public ArrayList<int[]> pos = new ArrayList();
    private JLabel enemigo, player, bala;
    private int x1, x2, y1, y2;
    private int contr = 1, contl = 1, contd = 1, contu = 1;
    private int vel, atk, pv;
    private int difx, dify;
    Soldado soldado;
    Enemigo enemy;
    ArrayList<String[]> mapa;
    private int m = 32;
    private boolean flag = false;
    public boolean seguido = false;
    
    public EnemigoMov(JLabel enemigo, JLabel personaje, int x1, int x2, int y1, int y2, Personaje xander, JLabel bala){
        this.enemigo = enemigo;
        this.player = personaje;
        this.bala = bala;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        soldado = new Soldado();
        soldado.CrearEnemigo();
        enemy = soldado.getEnemigo();
        vel = enemy.getVelocidad();
        atk = (int) enemy.getAtaque().get(0);
        pv = xander.getVida();
    }
    
    @Override
    public void run(){
        while(true){
            for(int i = x1; i <= x2; i += 8){
                enemigo.setIcon(new ImageIcon(getClass().getResource("/recursos/ERight"+contr+".png")));
                contr = Caminando(contr);
                enemigo.setLocation(i, enemigo.getY());
                SetDif();
                try {
                    sleep(vel);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if((player.getX() > enemigo.getX()) && (dify < 32 && difx < 150)){
                    seguido = true;
                    Seguir();
                }
            }
            for(int i = y1; i <= y2; i += 8){
                enemigo.setIcon(new ImageIcon(getClass().getResource("/recursos/EDown"+contd+".png")));
                contd = Caminando(contd);
                enemigo.setLocation(enemigo.getX(), i);
                SetDif();
                try {
                    sleep(vel);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if((player.getY() > enemigo.getY()) && (difx < 32 && dify < 150)){
                    seguido = true;
                    Seguir();
                }
            }
            for(int i = x2; i >= x1; i -= 8){
                enemigo.setIcon(new ImageIcon(getClass().getResource("/recursos/ELeft"+contl+".png")));
                contl = Caminando(contl);
                enemigo.setLocation(i, enemigo.getY());
                SetDif();
                try {
                    sleep(vel);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if((player.getX() < enemigo.getX()) && (dify < 32 && difx < 150)){
                    seguido = true;
                    Seguir();
                }
            }
            for(int i = y2; i >= y1; i -= 8){
                enemigo.setIcon(new ImageIcon(getClass().getResource("/recursos/EUp"+contu+".png")));
                contu = Caminando(contu);
                enemigo.setLocation(enemigo.getX(), i);
                SetDif();
                try {
                    sleep(vel);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if((player.getY() < enemigo.getY()) && (difx < 32 && dify < 150)){
                    seguido = true;
                    Seguir();
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
        difx = (int) Math.sqrt(Math.pow(enemigo.getX()-player.getX(), 2));
        dify = (int) Math.sqrt(Math.pow(enemigo.getY()-player.getY(), 2));
    }
    
    public void Seguir(){
        int cont = 0;
        int x, y;
        try {
            sleep(vel);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(true){
            System.out.println("");
            while(cont < pos.size()){
                x = pos.get(cont)[0];
                y = pos.get(cont)[1];
                if(enemigo.getX() < x){
                    enemigo.setIcon(new ImageIcon(getClass().getResource("/recursos/ERight"+contr+".png")));
                    contr = Caminando(contr);
                    enemigo.setLocation(x, y);
                    SetDif();
                    if(difx < 150 && dify < 32){
                        
                    }
                }
                if(enemigo.getX() > x){
                    enemigo.setIcon(new ImageIcon(getClass().getResource("/recursos/ELeft"+contl+".png")));
                    contl = Caminando(contl);
                    enemigo.setLocation(x, y);
                }
                if(enemigo.getY() < y){
                    enemigo.setIcon(new ImageIcon(getClass().getResource("/recursos/EDown"+contd+".png")));
                    contd = Caminando(contd);
                    enemigo.setLocation(x, y);
                }
                if(enemigo.getY() > y){
                    enemigo.setIcon(new ImageIcon(getClass().getResource("/recursos/EUp"+contu+".png")));
                    contu = Caminando(contu);
                    enemigo.setLocation(x, y);
                }
                try {
                    sleep(vel-25);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cont++;
            }
        }
    }
    
    public boolean Posicion(float posx,float posy){
        posx = posx/32;
        posy = posy/32;
        int y = (int) Math.floor(posy);
        int x = (int) Math.floor(posx);
        String[] aux = mapa.get(y);
        if("1".equals(aux[x])){
            return true;
        }
        return false;
    }
    
}
