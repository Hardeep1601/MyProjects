/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

import java.util.Random;

/**
 *
 * @author Hardeep
 */
public class randomNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
//        int num=rand.nextInt(101);
        int num= 1000;
        System.out.println("The number of the prime numbers generated : "+num);
        int a=1,b=2;
        while(a<=num){
            boolean prime=true;             // if true, its a prime number
            for(int z=2; z<b; z++){
                if(b%z==0 ){
                    prime=false;            // if false, its not a prime number
                }
            }
            if (prime==true){
                System.out.println(b);      //prints out the prime number
                a++;                        //check the amount of times the process is repeated, the first n frim number is displayed
            }
            b++;                            //increase the number range of b, so it can test more values
        }
    }
    
}
