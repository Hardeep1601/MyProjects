/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class Lab_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the sentence to be searched :");
      String sentence=sc.nextLine();
      
      System.out.println("Enter the word to be searched :");
      String search=sc.next();
      
      
      int intIndex2 = sentence.indexOf(search);
      
      if(intIndex2 == - 1) {
         System.out.println(search+" not found");
      } else {
         System.out.println( search+" found at index " + intIndex2);
      }
      
    }
    
}
