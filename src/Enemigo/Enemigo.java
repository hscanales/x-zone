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
public class Enemigo implements EnemigoPlan{
    
    private String nombre;
    private int vida, velocidad, cant;
    private ArrayList bolitas, xy, velbolitas, ataque;

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setAtaque(ArrayList ataque) {
        this.ataque = ataque;
    }

    @Override
    public void setVelocidad(int vel) {
        this.velocidad = vel;
    }

    @Override
    public void setCant(int cant) {
        this.cant = cant;
    }
    
    @Override
    public void setBolitas(ArrayList bolitas) {
        this.bolitas = bolitas;
    }

    @Override
    public void setXy(ArrayList xy) {
        this.xy = xy;
    }

    @Override
    public void setVelBolitas(ArrayList vel) {
        this.velbolitas = vel;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public ArrayList getAtaque() {
        return ataque;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public int getCant() {
        return cant;
    }

    @Override
    public ArrayList getBolitas() {
        return bolitas;
    }

    @Override
    public ArrayList getXy() {
        return xy;
    }

    @Override
    public ArrayList getVelBolitas() {
        return velbolitas;
    }
}
