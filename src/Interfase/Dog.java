/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import Abstraction.*;

/**
 *
 * @author USER
 */
// Reference link : Abstract Classes and Methods - Learn Abstraction in Java (Alex Lee)

// abstract classes are a bunch of variables and methods that is used to create other classes(use extends)

// abstract classes fixes the methods the other/child classes needs to have, but the child class can have other extra methods

// we cant have abstract class like regular classes because it helps us to create a regular class, but it can be used by implementing it in a regular class


// interface assumes all the methods in it is abstract(cant have any implemented methods in the interfase), but abstract classes can have a list of methods  and ones theat are already implemented

// both abstract methods and implemented methods can be inside an abstract class 

// extending - adding on to the previously implemented methods

// implementing - implements the all methods from the interfase

// abstract method is a method that hasnt been implemented yet 
public abstract class Dog {
    protected String name="Doggo !!!";
    
    public void bark(){
        System.out.println("Bark !!!");
    }
    
    //abstract method is a method that hasnt been implemented yet 
    public abstract void food(); 

}
