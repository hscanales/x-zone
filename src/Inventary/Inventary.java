/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventary;

import Items.Item;
import java.util.ArrayList;

/**
 *
 * @author vic_1
 */
public class Inventary {
    private ArrayList<Item> Object1List = new ArrayList<Item>(); //List of objects type Object one
    private final int ObjectMax; //Maximun Object 1 type on list
    private Item onUse; //Current Object
    public Inventary() {
        this.ObjectMax = 5;
    }

    public void setOnUse(Item onUse) {
        this.onUse = onUse;
    }

    public Item getOnUse() {
        return onUse;
    }
    //Select Current Object
    public void useObjectOfList(Item ObjecttoUse){
        for(Item Oactual : this.Object1List){
            if(Oactual.equals(ObjecttoUse)){
                this.setOnUse(Oactual);
                
                Oactual.use();
            }
        }
    }
    public void useObjectOfList(int ObjecttoUse){
        
        try{
            this.Object1List.get(ObjecttoUse);
            useObjectOfList(this.Object1List.get(ObjecttoUse));
        }
        catch(Exception e){
            System.out.print("no object here bruh\n");
        }
        
    }
    //Add object to the lsit
    public void addObject1(Item add){
        if(this.Object1List.size() < this.ObjectMax){
            System.out.print("Object added\n");
    
            this.Object1List.add(add);
        }
        else{
        System.out.print("max object capacity reached\n");
    }
    }
    // remove Object from the list
    public void RemoveObject(Item remove){
        this.Object1List.remove(remove);
    }
    // Drop Object fron
    public void DropObject(Item remove){
        this.Object1List.remove(remove);
    }
    public Item getObject(int i){
        return this.Object1List.get(i);
    }
    
    
}
