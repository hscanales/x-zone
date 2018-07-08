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

     private static Weapon arma = new Weapon();

    public Magnum() {
        arma.setName("44. Magnum");
        arma.setAmmo(24);
        arma.setAmmoActual(6);
        arma.setAmmoLimite(6);
        arma.setDamage(50);
        arma.setDistance(12);
        arma.setReload("slow");
        arma.setId(3);
    }

    @Override
    public void recargar() {
        int recarga = arma.getAmmoLimite()-arma.getAmmoActual();
        if(arma.getAmmo() - recarga < 0){
            recarga = arma.getAmmo();
        }
        arma.setAmmo(arma.getAmmo()-recarga);
        arma.setAmmoActual(arma.getAmmoActual()+recarga);
    }

    @Override
    public void disparar() {
        if(arma.getAmmo() > 0){
            if (arma.getAmmoActual() > 0) {
                arma.setAmmoActual(arma.getAmmoActual()-1);
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
        return arma.getAmmoActual();
    }

    @Override
    public void recolectarAmmo(int ammo) {
        arma.setAmmo(arma.getAmmo()+ammo);
    }

    @Override
    public int getID() {
        return arma.getId();
    }

    @Override
    public Weapon getWeapon() {
        return arma;
    }
   
}
