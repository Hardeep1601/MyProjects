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
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter the number of stars : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
