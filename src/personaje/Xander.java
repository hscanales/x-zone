/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

import Weapons.Weapon;
import Weapons.WeaponFactory;
import java.util.ArrayList;


/**
 *
 * @author MaPache
 */
public class Xander {
    
    private static Personaje Xander = new Personaje();
    
    public void crearPersonaje(){
        ArrayList<Weapon> arma = new ArrayList<>();
        WeaponFactory weapon = new WeaponFactory();
        arma.add(weapon.weaponCreator("desert").getWeapon());
        Xander.setArma(arma);
        Xander.setNombre("Xander");
        Xander.setAtaque(arma.get(0).getDamage());
        Xander.setVel(0);
        Xander.setVida(100000);
    }
    
    public Personaje getPersonaje(){
        return Xander;
    }
}
