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
public class Q1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pentagonal(3,12);
        
    }
    public static void pentagonal(int n,int check){
        int pent=1/2*n*(3*n-1);
        double pent1=0.5*n*(3*n-1);
        System.out.println(pent+""+pent1);
        if(pent1==check){
            System.out.println("The parameter is a pentagonal number");
        }else{
            System.out.println("The parameter is not a pentagonal number");
    
        }

    }
}