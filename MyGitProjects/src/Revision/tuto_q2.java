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
public class tuto_q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int random,point=0;
        String colour[]={"red","green","blue","orange","yellow"};
        char test='Y';
        while(test=='Y'){
            for(int i=0;i<10;i++){
                random=rand.nextInt(colour.length);
                String ans=colour[random];
                System.out.println("Pls enter a colour (red, green, blue, orange, yellow) :");
                String check=sc.next();
                if(ans.equals(check)){
                    point+=1;
                    System.out.println("The answer is correct");
                }
            }
            System.out.println("Do you want to exit the program ? (Y/N)");
            test=sc.next().charAt(0);
        }
        System.out.println("Your score is "+point);
        System.out.println("Program ended");
    }
    
}
