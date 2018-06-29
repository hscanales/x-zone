/*
 * 
 * 
 * 
 */
package Structures;

import java.util.ArrayList;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public interface Structure {
    int getXi();
    int getYi();
    int getXo();
    int getYo();
    ArrayList<Coordinate> getArea();
    void calcularArea();
    
    
    
}
