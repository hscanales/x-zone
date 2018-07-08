/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weapons.Pistols;

import Weapons.Weapon;
import Weapons.WeaponPlan;

/**
 *
 * @author uca
 */
public class Magnum implements WeaponPlan {

    public String name;
    public int ammo, ammoActual, ammoLimite;
    private int damage, distance;
    private String reload;
    public int id;

    public Magnum() {
        this.name = "44. Magnum";
        this.ammo = 24;
        this.ammoActual = 6;
        this.ammoLimite = 6;
        this.damage = 50;
        this.distance = 12;
        this.reload = "slow";
        this.id = 3;
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
        if (this.ammo > 0) {
            if (this.ammoActual > 0) {
                this.ammoActual--;
                //verificar si hay algun enemigo en el rango;
            } 
            else {
                recargar();
            }
        } 
        else {
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

    @Override
    public Weapon getWeapon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
