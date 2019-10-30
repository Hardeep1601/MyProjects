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
public class tuto_q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        int up=0,down=0;
        int coinToss=0;     //If 0 the coin is facing down, 1 is facing up
        System.out.println("Initially, the coin is facing down");
        
        for(int i=0;i<20;i++){
            coinToss=rand.nextInt(2);
            if(coinToss==0){
                down+=1;
            }
            else{
                up+=1;
                System.out.println("The coin is facing up");
            }
        }
        System.out.println("The number of times the coin is upwards is "+up);
        System.out.println("The number of times the coin is downwards is "+down);
    }
    
}
