/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuto6;

import java.util.Random;

public class Q1f {

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("10 random numbers is generated");
        //System.out.println("Enter the value to be searched : ");
        //int search=sc.nextInt();
        for(int i=0;i<10;i++){
            
            //int parse=;
            randomNum();
        }
        
    }
    public static void randomNum(){
        Random rand=new Random();
        
        int random=rand.nextInt(101);
        System.out.println(random);
    }
}
