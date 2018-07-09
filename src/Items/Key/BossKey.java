/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items.Key;

import Items.Item;
import java.net.URL;

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
    public URL get() {
    URL d = getClass().getResource("/recursos/heal.png");
    return d; 
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
