/*
 * 
 * 
 * 
 */
package Weapons;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public interface WeaponPlan {
    
    void recargar();
    void disparar();
    int getAmmo();
    void recolectarAmmo(int ammo);
    int getID();
    Weapon getWeapon();
}
