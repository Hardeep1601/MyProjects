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
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d=new Dog1();
        String name = d.name;
        System.out.println(name);
        d.bark();
        d.food();
        
        
        Dog d2=new Dog1();
        String name2=d.name;
        System.out.println(name2);
    }
    
}
