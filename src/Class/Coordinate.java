/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author USER
 */
public class Coordinate {
    public int x_coordinate;
    public int y_coordinate;
    
    Coordinate(){
        x_coordinate=0;
        y_coordinate=0;
    }
    
    public void setCoordinate(int x,int y){
        x_coordinate=x;
        y_coordinate=y;
    }
    
    public int getX_Coordinate(){
        return x_coordinate;
    }
    public int getY_Coordinate(){
        return y_coordinate;
    }
    
    public static void Coordinate(){
        Coordinate obj=new Coordinate();
        obj.setCoordinate(0, 0);
        System.out.println(obj.getX_Coordinate()+" "+obj.getY_Coordinate());
    } 
}
