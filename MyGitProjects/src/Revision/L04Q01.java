/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class L04Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here'
        Scanner sc=new Scanner(System.in);
        System.out.print("Pls enter an integer : ");
        int n=sc.nextInt();
        
        System.out.print("The factors are :");
        for(int i=1;i<=n;i++){
            
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
