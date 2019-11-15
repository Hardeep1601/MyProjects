/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.util.ArrayList;

/**
 *
 * @author Hardeep
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] fruits=new String[3];
        fruits[0]="Apple";
        fruits[1]="Pear";
        fruits[2]="Orange";
        
        System.out.println(fruits[2]);
        
        ArrayList fruitList=new ArrayList();                  // dont need to add/remove index for each time adding any elements from the ArrayList
        fruitList.add("Apple");
        fruitList.add("mangoes");
        fruitList.add("Banana");                             // adds elements into the array
        
        System.out.println("Array clone 1 : "+fruitList.clone());
        
        fruitList.remove("mangoes");                           // removes element from the list
        System.out.println("Array clone 2 : "+fruitList.clone());
        System.out.println(fruitList.get(1));                 // Will call out the element from the index number from the array
        
        System.out.println(fruitList);
        
        System.out.println(fruitList.contains("Banana"));  // will return true or false value depending on the presence of the object in the array list
        

    }
    
}
