/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weapons.Pistols;

import Weapons.Weapon;

/**
 *
 * @author uca
 */
public class M1911 implements Weapon {

    public String name;
    public int ammo, ammoActual, ammoLimite;
    private int damage, distance;
    private String reload;
    public int id;

    public M1911() {
        this.name = "Colt 1911";
        this.ammo = 36;
        this.ammoActual = 18;
        this.ammoLimite = 18;
        this.damage = 10;
        this.distance = 12;
        this.reload = "mid";
        this.id = 2;
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
        return this.ammoActual;
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
