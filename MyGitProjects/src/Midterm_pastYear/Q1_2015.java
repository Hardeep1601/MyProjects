/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Midterm_pastYear;

import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class Q1_2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the coordinate X and Y :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        int test_x=x,test_y=y;
        
        System.out.print("Enter the move : ");
        char move='T';
        
        while(move!='Q'){
            move=sc.next().charAt(0);
            switch(move){
                
                case 'L':
                    test_x=test_x-1;      //X=X-1
                    break;
                case 'R':
                    test_x=test_x+1;      //X=X+1
                    break;
                case 'U':
                    test_y=test_y+1;
                    break;
                case 'D':
                    test_y=test_y-1;
                    break;
                case 'Q':
                    break;
            }
            //move=sc.next().charAt(0);
        }
        
        System.out.println("Initial Coordinate : "+x+" "+y);
        System.out.println("Final Coordinate : "+test_x+" "+test_y+"\n");
    }
    
}
