/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

/**
 *
 * @author USER
 */
interface WaterBottleInterfase{     // Interface is a outline of a class
    String color = "Blue";
    
    void fillUp();
    void pourOut();
}

public class InterfaseExample implements WaterBottleInterfase{
    
    // implementing uses all the methods and attiributes inside the interface
    
    public static void main(String[] args) {        // main method just helps to run the code
        // TODO code application logic here
        InterfaseExample ex=new InterfaseExample(); //creates the class of itself
        
//        System.out.println(color);  // since WaterBottleInterfase is implementes,, so it knows the "color" variable
        ex.fillUp();
        ex.pourOut();
    }

    // everything (methods and attributes) in the interface must be in the class, or else there is an error
    @Override   // priotises the code with overrides
    public void fillUp() {      
        System.out.println("Water is filled");
    }

    @Override
    public void pourOut() {
        System.out.println("Water is poured");
    }
    
}
