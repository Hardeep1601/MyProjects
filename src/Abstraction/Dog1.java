/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author USER
 */
public class Dog1 extends Dog{      

    /*  dog1(child) object is an extension of dog(parent)
    
        the child class comes with the methods of the parent class but can also 
        but can also have their own addittional methods
    */
    public void food(){
        System.out.println("Dog Food !!!");
    }
    public void bark(){
        System.out.println("Woof woof !!!");
    }
    
}
