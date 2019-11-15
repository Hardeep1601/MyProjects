
package TutorialWork;

import java.util.Scanner;

public class L05Q06_1 {

    public static void main(String[] args) {
       
        System.out.println("Welcome to Java program to print Pascal's triangle");
        System.out.println("Please enter number of rows of Pascal's triangle");
        
        // Using try with resource statment to open Scanner
        // no need to close Scanner later
            Scanner scnr = new Scanner(System.in);
            int rows = scnr.nextInt();            
            System.out.printf("Pascal's triangle with %d rows %n", rows);
            
            for (int i = 0; i < rows; i++) {
                int number = 1;
                System.out.printf("%" + (rows - i) * 2 + "s", "");
                for (int j = 0; j <= i; j++) {
                    System.out.printf("%4d", number);
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
        
        }
        
        
    }
}
    