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
public class tuto_q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int total=0;
        System.out.println("Enter the number of months : ");
        int months=sc.nextInt();
        int perMonth[]=new int[months];
        
        for(int i=0;i<months;i++){
            System.out.println("Enter the number of orders in a month : ");
            int numOrders=sc.nextInt();
            int points=0;
            
            if(numOrders==0){
                points+=0;
            }
            else if(numOrders==1){
                points+=5;
            }
            else if(numOrders==2){
                points+=15;
            }
            else if(numOrders==3){
                points+=30;
            }
            else{
                points+=60;
            }
            total+=points;
            perMonth[i]=points;
        }    
        for(int i=0;i<months;i++){
            System.out.println("\nThe number of points for month "+(i+1)+" is "+perMonth[i]);
        }
    }   
    
    
}
