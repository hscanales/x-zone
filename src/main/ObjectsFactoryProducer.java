/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Interface.AbstractFactory;
import Items.ItemFactory;
import Weapons.WeaponFactory;

/**
 *
 * @author pretc
 */
public class ObjectsFactoryProducer {
    public static AbstractFactory getFactory(String type){
        String typefix = type.toLowerCase();
        switch(typefix){
            case "item":
                    return new ItemFactory();
            case "weapon":
                return new WeaponFactory();
        }
        return null;
                }
}
