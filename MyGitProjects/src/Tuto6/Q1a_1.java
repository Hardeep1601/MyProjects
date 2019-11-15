/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuto6;

/**
 *
 * @author Hardeep
 */
public class Q1a_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(maximum(4,6,2));
    }
    public static int maximum(int a, int b, int c){
        int max=a;
        if(max<b){      // replace max with b, if b is more than a  
            max=b;
        }
        if(max<c){      // replace max woth c, if max is more than a or b
            max=c;
        }
        return max;
        
        
    }
    
}
