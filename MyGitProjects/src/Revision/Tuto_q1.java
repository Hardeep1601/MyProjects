
package Revision;

import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class Tuto_q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter weight in pounds : ");
        double weight=sc.nextDouble();
        System.out.println("Pls enter height in inches : ");
        double height=sc.nextDouble();
        double bmi=(weight*703)/(height*height);
        
        if(bmi>=18.5 && bmi<=25){
            System.out.println("Your weight is normal");}
        else if(bmi<18.5){
            System.out.println("You are underweight");
        }
        else{
            System.out.println("You are overweight");
        }
            
    }
    
}
