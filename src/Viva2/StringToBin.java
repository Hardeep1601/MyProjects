/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viva2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class StringToBin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        //String binary=sc.next();
        String str="1111111111";
        String str2="1111100000";
        stringToBin(str,str2);
    }
    public static void stringToBin(String str,String str2){
        char bin[]=new char[str.length()];
        char bin2[]=new char[str2.length()];
        char bin3[]=new char[str.length()];
        System.out.println("The X-OR value is : ");
        for(int i=0;i<str.length();i++){
            bin[i]=str.charAt(i);
            bin2[i]=str2.charAt(i);
            if((bin[i]=='1' && bin2[i]==bin[i]) || (bin[i]=='0' && bin2[i]==bin[i])){
                bin3[i]='0';
            }else{
                bin3[i]='1';
            }
            System.out.print(bin3[i]);
        }
        System.out.println("");
        
        
        
    }
}
