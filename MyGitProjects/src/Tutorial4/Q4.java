/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial4;

/**
 *
 * @author Hardeep
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="Hello";
        for(int i=0; i<s.length();i++){
               System.out.print(s.charAt((s.length()-1)-i));
        }
    }
    
}
