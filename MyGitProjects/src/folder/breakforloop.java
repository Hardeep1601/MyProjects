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
public class breakforloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 5 ; i++){
                                                    // break here will not run because it will not be able to print out any values in the second for loop
            for (int j = 0; j < 3 ; j++){
            
                System.out.println(i + " ," + j);
                break;                              // Cannot increment the j beacuse the statement exits the for loop before it can increment j 
            
        }
                                                    // break here will cause i=0 and the j will increment from 0 - 2, as the i cannot be increment due to the break statement 
        }
        
    }
    
}
