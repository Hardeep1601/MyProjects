/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

/**
 *
 * @author Hardeep
 */
public class sideTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
        int t=n/2+1;  // 5/2+1=3
        
        for(int i=0;i<t;i++){
            int x=2*i+1;
            for(int j=0;j<x;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        int x=n-t;
        int z=1;
        
        for(int i=n-1;i>(n-t);i--){
            int y=i/2+1*z;
            for(int j=0;j<y;j++){
                System.out.print("*");
               
            }
            System.out.println("");
            z=0;
        }
        
        
        
        
        
        
        
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(i%2==0){
//                    break;
//                }
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        
        
    }
    
}
