/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

/**
 *
 * @author USER
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r=5,mp1,mp2;
        int rem=r/2+1;
        mp1=rem+1;
        mp2=rem+r+1;
        int total;
        for(int i=0;i<=r*2+1;i++){
            if(i==0 || i==rem*2+2){
                
                for(int j=0;j<rem;j++){
                    System.out.print(" ");
                }
                System.out.print(" ");
                for(int j=0;j<r-1;j++){
                    System.out.print("*");
                }
                for(int j=0;j<rem;j++){
                    System.out.print(" ");
                }
            }else{
                for(int j=1;j<=r*2+2;j++){
                    if(j==mp1 || j==mp2 ){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    
                }
                if(i<r-1){
                    mp1--;
                    mp2++; 
                }else if(i<r*2-2){
                    
                    mp1++;
                    mp2--;
                }else{
                    break;
                }
                
                
            }
            
            System.out.println("");
        }
    }
    
}
