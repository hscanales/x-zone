/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemigo;

import java.util.ArrayList;

/**
 *
 * @author MaPache
 */
public interface EnemigoPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setAtaque(ArrayList ataque);
    public void setVelocidad(int vel);
    public void setCant(int cant);
    public void setBolitas(ArrayList bolitas);
    public void setXy(ArrayList xy);
    public void setVelBolitas(ArrayList vel);
    public String getNombre();
    public int getVida();
    public ArrayList getAtaque();
    public int getVelocidad();
    public int getCant();
    public ArrayList getBolitas();
    public ArrayList getXy();
    public ArrayList getVelBolitas();
}
