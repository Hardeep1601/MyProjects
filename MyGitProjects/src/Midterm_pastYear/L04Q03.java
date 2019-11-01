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
public class L04Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        int min=999,max=0,num,counter=1,numSq=0,sum=0;
        double avg,sd,sd2;
        System.out.print("Enter a score (Enter a negative score to exit): ");
        num=sc.nextInt();
        
        while(num!=-1){  
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
            counter=counter+1;
            sum=sum+num;
            numSq=numSq+num*num;
            System.out.print("Enter a score : ");
            num=sc.nextInt();
        }
        counter = counter-1;
        avg=sum/counter;
        sd=((numSq -((sum*sum)/counter))/(counter-1));
        
        sd2= Math.sqrt(sd);
        
        System.out.println("Counter            :" + counter);
        System.out.println("Maximum Score      :" + max);
        System.out.println("Minimum Score      :" + min);
        System.out.println("Average Score      :" + avg);
        System.out.print("Standard deviation :");
        System.out.printf("%.2f", sd2);
            
    }
    
}
