/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Items.Item;
import Weapons.Weapon;

/**
 *
 * @author pretc
 */
public interface AbstractFactory {
    Item itemCreator(String type);
    
    Weapon weaponCreator(String type);
}
