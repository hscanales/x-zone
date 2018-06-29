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
public class Wall implements Structure{
    int xi,yi,xo,yo;
    ArrayList<Coordinate> area = new ArrayList<>();
    

    public Wall(int xi, int yi, int xo, int yo) {
        this.xi = xi;
        this.yi = yi;
        this.xo = xo;
        this.yo = yo;
        calcularArea();
    }
    
    
    @Override
    public int getXi() {
        return xi;
    }

    @Override
    public int getYi() {
        return yi;
    }

    @Override
    public int getXo() {
        return xo;
    }

    @Override
    public int getYo() {
        return yo;
    }

    @Override
    public ArrayList<Coordinate> getArea() {
    return area;
    }

    @Override
    public void calcularArea() {
        for(int j=xi;j<=xo;j++){
            for(int i=yi;i<=yo;i++){
             Coordinate coordenada = new Coordinate(j,i);
             area.add(coordenada);
            }     
        }
    }
    



}
