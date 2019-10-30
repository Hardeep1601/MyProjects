/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuto6;

/**
 *
 * @author Hardeep
 */
public class Q1e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        string("alpha1");
        
    }
    public static void string(String test){
        System.out.println("The number of characters in the string is "+test.length());
        //String a[]=test;
        int letter=0,digit=0;
        for(int i=0;i<test.length();i++){
            if(Character.isLetter(test.charAt(i))){
                letter+=1;
            }
            else{
                digit+=1;
            }
        }
        System.out.println("The number of letters is "+letter);
        System.out.println("The number of digits is "+digit);
        
    }
    
}
