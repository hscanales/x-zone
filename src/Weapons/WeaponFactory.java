/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weapons;

import Interface.AbstractFactory;
import Items.Item;
import Weapons.AR.*;
import Weapons.Pistols.*;
import Weapons.SMG.*;

/**
 *
 * @author pretc
 */
public class WeaponFactory implements AbstractFactory{

    @Override
    public Item itemCreator(String type) {
        throw new UnsupportedOperationException("Not supported here"); 
    }

    @Override
    public Weapon weaponCreator(String type) {
    switch(type.toLowerCase()){
        case "m416":
            return new M416();
        case "scarh":
            return new Scar_H();
        case "desert":
            return new DE();
        case "colt":
            return new M1911();
        case "magnum":
            return new Magnum();
        case "mp5":
            return new MP5();
        case "p90":
            return new P90();
        case "ump45":
            return new UMP459();
    
    }
    
    
    return null;
    }
    
}
