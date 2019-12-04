/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_9.Question1a;

/**
 *
 * @author USER
 */

class Parent {  } 
class Child extends Parent { } 
  
class test {

    public static void main(String[] args) {
        Child cobj = new Child(); 
  
        
        System.out.println(isClass(cobj));
        Animal a=new Animal(3,1.5,10);
        System.out.println(a.toString());
        
        // A simple case 
        if (cobj instanceof Child) 
           System.out.println("cobj is instance of Child"); 
        else
           System.out.println("cobj is NOT instance of Child"); 
  
        
  
        // instanceof returns true for all ancestors (Note : Object 
        // is ancestor of all classes in Java)  
        if (cobj instanceof Object) 
           System.out.println("cobj is instance of Object"); 
        else
           System.out.println("cobj is NOT instance of Object");  
    }
    
    public static boolean isClass(Object a){
        // instanceof returns true for Parent class also  
        if (a instanceof Parent) 
           return true;
        else
           return false; 
    }
}
