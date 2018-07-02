/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items.Key;

import Items.Item;

/**
 *
 * @author pretc
 */
public class BossKey implements Item{

    
    
    @Override
    public void use() {
    //healing :v
    }

    @Override
    public int get() {
    
    return 1;
    }

    @Override
    public boolean isHealing() {
    return false;
    }

    @Override
    public boolean isKey() {
   return true;
    }

    @Override
    public boolean itsATrap() {
     return false;
    }
    
}
