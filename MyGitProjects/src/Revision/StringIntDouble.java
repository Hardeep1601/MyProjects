/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

/**
 *
 * @author Hardeep
 */
public class StringIntDouble {

    /** Reference if this notes
     * Found from https://www.java67.com/2012/10/best-way-to-convert-numbers-to-string-in-java-example.html
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String str="1234";
        double num=4321;
        int num1=6789;
        
        //Converting string to int
        int a=Integer.parseInt(str);
        System.out.println(a);
        
        //Converting int to string 
        String test=Integer.toString(num1);
        System.out.println(test);
        
        //Converting double to string
        String test2=Double.toString(num);
        System.out.println(test2);
        
        //Converting string to double 
        double d=Double.valueOf(test2);
        System.out.println(d);
    }
    
}
