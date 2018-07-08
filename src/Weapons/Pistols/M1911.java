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
public class M1911 implements WeaponPlan {

    private static Weapon arma = new Weapon();
    public M1911() {
        
         arma.setAmmo(36);
        arma.setName("Colt 1911");
        arma.setAmmoActual(18);
        arma.setAmmoLimite(18);
        arma.setDamage(10);
        arma.setReload("mid");
        arma.setDistance(12);
        arma.setId(2);
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
