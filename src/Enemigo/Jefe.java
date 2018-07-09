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
public class Jefe implements EnemigoWorker{

    private static Enemigo Jefe = new Enemigo();
    
    @Override
    public void CrearEnemigo() {
        ArrayList<Integer> ataque = new ArrayList<>();
        ataque.add(15);
        ataque.add(20);
        ArrayList<Integer> bolitas = new ArrayList<>();
        bolitas.add(4);
        bolitas.add(1);
        ArrayList<Integer> xy = new ArrayList<>();
        xy.add(20);
        xy.add(40);
        ArrayList<Integer> velbolitas = new ArrayList<>();
        velbolitas.add(10);
        velbolitas.add(20);
        Jefe.setNombre("Sapo legendario");
        Jefe.setAtaque(ataque);
        Jefe.setVida(100);
        Jefe.setVelocidad(50);
        Jefe.setCant(2);
        Jefe.setVelBolitas(bolitas);
        Jefe.setXy(xy);
        Jefe.setVelBolitas(velbolitas);
    }

    @Override
    public Enemigo getEnemigo() {
        return Jefe;
    }
    
}
