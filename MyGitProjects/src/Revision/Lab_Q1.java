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
public class Lab_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String num = "123456789";
        String ID[]=new String[5];
        
        Random rand = new Random();
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<ID.length;i++){
            char c = chars.charAt(rand.nextInt(chars.length()));
            //char n = chars.charAt(rand.nextInt(num.length()));
            int random=rand.nextInt(101);
            ID[i]=c+""+random;
            System.out.println(ID[i]);        //workerID
        
        }
        int a=0,b=0,c=0,d=0,e=0,f=0;
        String fruits[]={"rambutan","durian","langsat","mangosteen","jackfruit","mango"};
        int n=sc.nextInt();
        
        for(int i=0;i<10;i++){
            
            int random=rand.nextInt(fruits.length);
            String ans=fruits[random];
            
            if(ans.equals("rambutan")){
                a+=1;
            }
            else if(ans.equals("durian")){
                b+=1;
            }
            else if(ans.equals("langsat")){
                c+=1;
            }
            else if(ans.equals("mangosteen")){
                d+=1;
            }
            else if(ans.equals("jackfruit")){
                e+=1;
            }
            else if(ans.equals("mango")){
                f+=1;
            }
            
        }
        
    }
    
}
