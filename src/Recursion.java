/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nPrintln("das",5);
    }
    public static void nPrintln(String message, int times) { 
        if (times == 0) {
            System.out.println("Done!!");
    } else {
            System.out.println(message);
            times--;
            nPrintln(message, times); 
        }
        
    } // The base case is times == 0 }
    
}
