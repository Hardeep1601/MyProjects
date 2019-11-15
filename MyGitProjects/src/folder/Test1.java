/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        
        int sum=1;
        int num[]=new int[20];
        int low=0,high=(num.length-1),middle;
        int sum1=0;
        
        for(int i=0;i<num.length;i++){
            num[i]=rand.nextInt(101);
            System.out.print(num[i]+" ");
        }
        
        System.out.print("\nEnter the number to be searched : "); 
        int search=sc.nextInt();
        
        for(int i=0;i<num.length;i++){
            if(search==num[i]){
                System.out.println(search+" found"); 
                System.out.println("Linear Search - "+ sum+" loop(s)");
            }
            sum+=1;
        }
       
        while(low<=high){
            middle=(low+high)/2;
            if(search==num[middle]){
                System.out.println(search+" found"); 
                System.out.println("Binary Search - "+ sum1+" loop(s)");
                break;
           }
            else if(search<num[middle]){
                high=middle-1;
                sum1+=1;
            }
            else{
                low=middle+1;
                sum1+=1;
            }
        }

    }
    
}
