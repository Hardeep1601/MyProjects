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

import java.util.Scanner;
public class Q1g {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the radius of circle : ");
        int radius=sc.nextInt();
        areaCirc(radius);
    }
    public static void areaCirc(int rad){
        
        double area=Math.PI*rad*rad;
        double circ=2*rad*Math.PI;
        System.out.printf("The area of the circle is %.2f",area);
        System.out.printf(" and the circumference of the circle is %.2f",circ);
    }
    
}
