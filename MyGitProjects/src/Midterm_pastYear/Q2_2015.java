/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Midterm_pastYear;

import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class Q2_2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String fruit;
        
        double a=0,b=0,c=0,d=0;
        double weight,total=0;
        
        System.out.print("Enter the durian type : ");
        fruit=sc.next();
        
        while(!fruit.equals("Q")){
            
            
            System.out.print("Enter the sales in kg : ");
            weight=sc.nextDouble();
            
            switch(fruit){
                case "MK":
                    a=a+(weight*25);
                    total+=a;
                    break;
                case "HL":
                    b=b+(weight*22);
                    total+=b;
                    break;
                case "D24":
                    c=c+(weight*20);
                    total+=c;
                    break;
                case "UM":
                    d=d+(weight*18);
                    total+=d;
                    break;
                
            }
            System.out.print("Enter the durian type : ");
            fruit=sc.next();
        }
        System.out.printf("Total sales : %.2f",total);
        
            
    }
    
}
