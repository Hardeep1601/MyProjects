/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author USER
 */
public class enhancedForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[]={3,6,8,1,5};
        int total=0;
        
//        for(DATATYPE VARIABLE : ARRAY_NAME)
        for(int x : array){
            System.out.println(x);
            total+=x;
        }
        System.out.println(total);
    }
    
}
