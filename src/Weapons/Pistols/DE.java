/*
 * 
 * 
 * 
 */
package Weapons.Pistols;

import Weapons.Weapon;
import Weapons.WeaponPlan;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class DE implements WeaponPlan {
    
    private static Weapon arma = new Weapon();

    public DE() {
        arma.setAmmo(15);
        arma.setName("Desert Eagle");
        arma.setAmmoActual(7);
        arma.setAmmoLimite(7);
        arma.setDamage(50);
        arma.setReload("slow");
        arma.setDistance(12);
        arma.setId(1);
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
