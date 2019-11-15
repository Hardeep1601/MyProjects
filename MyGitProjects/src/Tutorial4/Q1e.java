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
public class Q1e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sum=0,n=1;
        for(int i=0;i<25;i++){
            sum=sum+(i+1)/(25-i);
        }
        System.out.println(sum);
    }
    
}
