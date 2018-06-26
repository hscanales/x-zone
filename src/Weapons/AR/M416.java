/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weapons.AR;

import Weapons.Weapon;

/**
 *
 * @author MaPache
 */
public class M416 implements Weapon{
    
    public String name;
    public int ammo, ammoActual, ammoLimite;
    private int damage, distance;
    private String reload;
    public int id;
    
    public M416(){
        this.name = "M416";
        this.ammo = 60;
        this.ammoActual = 30;
        this.ammoLimite = 30;
        this.damage = 20;
        this.distance = 12; //No se si sería 12 :v
        this.reload = "mid";
        this.id = 7;
    }
    
    @Override
    public void recargar() {
        int recargadas = this.ammoLimite - this.ammoActual;
        if(this.ammo - recargadas < 0){
            recargadas = this.ammo;
        }
        this.ammo -= recargadas;
        this.ammoActual = ammoActual+recargadas;
    }

    @Override
    public void disparar() {
        if(this.ammo > 0){
            if (this.ammoActual > 0) {
                this.ammoActual--;
                //verificar si hay algun enemigo en el rango;
            } 
            else {
                recargar();
            }    
        }
        else{
            System.out.println("No tienes municion");
        }
    }

    @Override
    public int getAmmo() {
        return ammoActual;
    }

    @Override
    public void recolectarAmmo(int ammo) {
        this.ammo += ammo;
    }

    @Override
    public int getID() {
        return id;
    }
}
