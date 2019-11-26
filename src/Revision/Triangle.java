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
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r=5,mp1,mp2;
        mp1=r;
        mp2=r+1;
        
        for(int i=0;i<=r*2;i++){
            for(int j=0;j<=r*2+1;j++){
                
                if(j==mp1 || j==mp2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            if(i<r){
                mp1--;
                mp2++; 
            }else{
                mp2--;
                mp1++; 
            }
            
            System.out.println("");
        }
        
    }
    
}
