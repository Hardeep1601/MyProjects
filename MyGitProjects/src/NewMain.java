/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hardeep
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            String name = "Adam Jenson";
            System.out.println("Name : "+name);
            System.out.println("Uppercase : "+name.toUpperCase());
            System.out.println("Lowercase : "+ name.toLowerCase());
            System.out.println("First Character : "+ name.charAt(0)); 
            System.out.println("Length : "+name.length());
            System.out.println("Last Character : "+name.charAt(10));
            
            int[] array =array1(4,4,7);
            System.out.println(array[0]);
    }
    
    public static int[] array1(int a,int b,int c){
             int[] array1 = new int[3];
             array1[0]=a;
             array1[1]=b;
             array1[2]=c;
             return array1;
       
    }
}
