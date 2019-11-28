/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viva2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Permutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a array of 4 Non_dublicate number : ");
        
        int arr[]=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            for(int j=0;j!=i;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Pls enter a new number for index "+i+": ");
                    arr[i]=sc.nextInt();
                    
                }
            }
        }
        System.out.println("New");
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }

        System.out.println("new ");
        for(int i=0;i<4;i++){
            System.out.print(arr[i]+" ");;
            
            for(int j=0;arr[i]!=arr[j] && j<1;j++){
                System.out.print(arr[j]+"");
                
               for(int k=0;arr[i]!=arr[j] && arr[j]!=arr[k] && arr[i]!=arr[k] && k<2;){
                   System.out.print(arr[k]+" "+arr[k+1]);
//                   System.out.println("");
//                   System.out.print(arr[i]+" "+arr[j]+""+arr[k]+" "+arr[k+1]);
               } 
            }
            System.out.println(" ");
        }
        
    }
    
}
