/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weapons.SMG;

import Weapons.Weapon;

/**
 *
 * @author MaPache
 */
public class MP5 implements Weapon{
    
    public String name;
    public int ammo, ammoActual, ammoLimite;
    private int damage, distance;
    private String reload;
    public int id;
    
    public MP5(){
        this.name = "MP5";
        this.ammo = 120;
        this.ammoActual = 30;
        this.ammoLimite = 30;
        this.damage = 7;
        this.distance = 12; //No se si sería 12 :v
        this.reload = "fast";
        this.id = 5;
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
