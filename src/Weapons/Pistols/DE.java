/*
 * 
 * 
 * 
 */
package Weapons.Pistols;

import Weapons.Weapon;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class DE implements Weapon {

    public String name;
    public int ammo, ammoActual, ammoLimite;
    private int damage, distance;
    private String reload;
    public int id;

    public DE() {
        this.name = "Desert Eagle";
        this.ammo = 15;
        this.ammoActual = 7;
        this.ammoLimite = 7;
        this.damage = 50;
        this.reload = "slow";
        this.distance = 12;
        this.id = 1;
    }

    @Override
    public void recargar() {
            int recargadas = this.ammoActual - this.ammoLimite;
        this.ammo-= recargadas;
        this.ammoActual= 7;
    }

    @Override
    public void disparar() {
        if(this.ammo>0){
        if (this.ammoActual > 0) {
            this.ammoActual--;
            //verificar si hay algun enemigo en el rango;
        } else {
            recargar();
        }    
        }else{
            System.out.println("No tienes municion");
        }
        

    }

    @Override
    public int getAmmo() {
        return ammo;
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
