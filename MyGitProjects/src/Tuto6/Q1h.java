/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuto6;

import java.util.Random;

/**
 *
 * @author Hardeep
 */
public class Q1h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        randomNum();
        
    }
        public static void randomNum(){
        Random rand=new Random();
        
        int random[]=new int[50];
        int check[]=new int[50];
                
        int repeat=0;
        int flag=0;
        
        random[0]=rand.nextInt(11);
        check[0]=random[0];
        System.out.println(random[0]);
            
            for(int i=1;flag!=1;i++){
                random[i]=rand.nextInt(11);
                check[i]=random[i];
                System.out.println(random[i]);
                for(int y=0;y<i;y++){
                    if(check[y]==random[i]){
                        System.out.println("this num is repeating :"+check[y]);
                        flag=1;
                    }
                }
            }
        }
}
    

