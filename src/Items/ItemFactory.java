/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import Interface.AbstractFactory;
import Items.Heal.Heal;
import Items.Key.BossKey;
import Items.Key.Key;
import Weapons.Weapon;

/**
 *
 * @author pretc
 */
public class ItemFactory implements AbstractFactory{

    @Override
    public Item itemCreator(String type) {
        switch(type.toLowerCase()){
            case "bosskey":
                return new BossKey();
            case "key":
                return new Key();
            case "heal":
                return new Heal();
        }
    return null;
    }

    @Override
    public Weapon weaponCreator(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
