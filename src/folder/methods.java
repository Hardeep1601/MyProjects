/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author Hardeep
 */
public class methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    // main method for java
        // TODO code application logic here
        System.out.println(mult(5,6));          // method call for a return method
        System.out.println(mult(51,75));
        
        add(5,5);                               // non-return method /void
        add(500,139);
        helloWorld();
        
    }
    public static int mult(int a, int b){      // return method returns a value
        return (a*b); 
    }
    
    public static void add(int x, int y){
        int z=x+y;
        System.out.println(z);
    }
    
    public static void helloWorld(){
        System.out.println("Hello World");
    }
}
