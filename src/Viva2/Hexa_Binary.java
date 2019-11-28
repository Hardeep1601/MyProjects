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
public class Hexa_Binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HexaDecimal to Binary");
	Scanner scan = new Scanner(System.in);
	System.out.println("\nEnter the number :");
	int num = Integer.parseInt(scan.nextLine(), 16);        // hexadecimal to decimal
        System.out.println(num);
        String binary = Integer.toBinaryString(num);            // decimal to binary
        String binary1 = Integer.toString(num, 20);               // decimal to binary
	System.out.println("Binary Value is : " + binary1);
    }
    
}
