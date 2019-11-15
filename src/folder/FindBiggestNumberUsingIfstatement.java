/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class FindBiggestNumberUsingIfstatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x=743,y=41,z=153;
        
        if(x>y){
            if(x>z)
                System.out.println("X is the largest number");
            else
                System.out.println("Z is the largest number");
        }
        else{
            if(y>z)
                System.out.println("Y is the largest number");
            else
                System.out.println("Z is the largest number");
            
        }
    }
    
}
