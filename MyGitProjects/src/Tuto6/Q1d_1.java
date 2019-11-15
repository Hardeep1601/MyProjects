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
public class Q1d_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(pent(7)){
            System.out.println("The parameter is a pentagonal number");
        }
        else{
            System.out.println("The parameter is not a pentagonal number");
        }
    }
    public static boolean pent(int i){
        int n=1;
        double pent;
        do{
            pent=0.5*n*(3*n-1);
            n++;
        }
        while(i>pent);
        if(pent==i){
            return true;
        }
        else{
            return false;
        }
                
    }
    
}
