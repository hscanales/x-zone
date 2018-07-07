/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemigo;

import java.util.ArrayList;
import java.lang.Integer;

/**
 *
 * @author MaPache
 */
public class Soldado implements Enemigo{
    
    private static EnemigoWorker Soldado = new EnemigoWorker();

    @Override
    public void CrearEnemigo() {
        ArrayList<Integer> ataque = new ArrayList<>();
        ataque.add(10);
        ArrayList<Integer> bolitas = new ArrayList<>();
        bolitas.add(1);
        ArrayList<Integer> xy = new ArrayList<>();
        xy.add(20);
        ArrayList<Integer> velbolitas = new ArrayList<>();
        velbolitas.add(10);
        Soldado.setNombre("Soldado genoma");
        Soldado.setAtaque(ataque);
        Soldado.setVida(100);
        Soldado.setVelocidad(75);
        Soldado.setCant(1);
        Soldado.setVelBolitas(bolitas);
        Soldado.setXy(xy);
        Soldado.setVelBolitas(velbolitas);
    }
    
    @Override
    public EnemigoWorker getEnemigo() {
        return Soldado;
    }   
}
