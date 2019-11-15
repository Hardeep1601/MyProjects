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
public class CapitalLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char letter=sc.next().charAt(0);
        System.out.println(Character.isUpperCase(letter));
        
        letter = 'g';
        boolean isUppercase= Character.isUpperCase(letter);
        System.out.println("Upper case letter is " + isUppercase);
        
        
        
            }
    
}
