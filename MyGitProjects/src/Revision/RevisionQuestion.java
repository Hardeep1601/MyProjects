/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class RevisionQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Pls enter the number of players :");
        
        int n=sc.nextInt();
        int player[]=new int[n];
        int scores[]=new int[n];
        int sum[]=new int[n];
        int max=0;
        
        System.out.println("Tet");
        
        for(int i=0;i<n;i++){
            sum[i]=0;
        }
        while(max<=50){
            
            for(int j=0;j<n;j++){
                player[j]=rand.nextInt(21)-10;
                sum[j]=sum[j]+player[j];
                
                System.out.println("Player "+(j+1)+" score :"+player[j]+", "+sum[j]);
                
                max=sum[j];
                if(sum[j]>=50){
                    System.out.println(max+" is the max and player "+ (j+1)+" wins !!");
                    break;
                }
            }   
        }
    }
}
    

