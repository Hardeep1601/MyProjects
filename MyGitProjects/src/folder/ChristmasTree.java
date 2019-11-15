/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author Hardeep
 */
public class ChristmasTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int iRow=1; iRow<=5; iRow++){
            for(int iCol = 0; iCol<iRow; iCol++){
                System.out.print("*");
            
            }
            System.out.println(" ");
        
        }
        
        for (int i = 0; i<5;i++){
            for (int j=0; j<5;i++){
                System.out.println("*");
            }
        }
    }
    
}
