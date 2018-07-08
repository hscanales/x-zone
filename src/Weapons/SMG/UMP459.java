/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weapons.SMG;

import Weapons.Weapon;
import Weapons.WeaponPlan;

/**
 *
 * @author MaPache
 */
public class UMP459 implements WeaponPlan{
    
    private static Weapon arma = new Weapon();
    public UMP459(){
        
        arma.setName("UMP459");
        arma.setAmmo(64);
        arma.setAmmoActual(32);
        arma.setAmmoLimite(32);
        arma.setDamage(32);
        arma.setDistance(12);
        arma.setReload("fast");
        arma.setId(6);
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
