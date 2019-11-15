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
public class Q2_2016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter nine digit integer : ");
        String num=sc.next();
        int cs=0;       // Initiate checksum
        
        
        for(int i=0;i<9;i++){
            char a=num.charAt(i);                       // Change string to char at index "i"
            int x=Integer.parseInt(String.valueOf(a));  // Change char to int
            cs=cs+(x*(i+1));
            
        }
        
        int z=cs%11;        // calculate checksum
        
        System.out.print("10-digit ISBN : ");
        
        //Initiate till x<9
        for(int x=0;x<9;x++){
            char a;
            
            a=num.charAt(x);
            int y=Integer.parseInt(String.valueOf(a));
            
            
            if(x==0){
                System.out.print(a);
            }
            else if(x==1 || x==2 || x==3){
                System.out.print(a);
            }
            else{
                System.out.print(a);
            }
            if(x==0 || x==3){
                System.out.print("-");
            }
        }
        // for x=10, initiate differently to make it easier(to not encounter OutOfBoundException)
        System.out.print("-");
        if(z==10){
                System.out.print("X\n");
                }
                else{
                   System.out.print(z+"\n"); 
                }
    }
    
}
