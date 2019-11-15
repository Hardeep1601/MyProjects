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
public class repeatingString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String array[]={"Hello","My","Name","Is","Robit"};
        StringBuilder sb = new StringBuilder();
        String reverse="";
        
        for(int i=0;i<array.length;i++){
            //System.out.println(array[i].length());   // to get the number of characters in the array[i]
            
            for(int j=0;j<array[i].length();j++){
                reverse=reverse+array[i].charAt(array[i].length()-1-j);
            }
            System.out.println(reverse);
        }
    }
    
}
