/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.ArrayList;

/**Arraylist reference :
 * https://www.baeldung.com/find-list-element-java
 * https://stackoverflow.com/questions/8439037/better-way-to-find-index-of-item-in-arraylist
 */
public class AnimalList {
    
    private ArrayList<Animal> AnimalList=new ArrayList<Animal>();       // can add unlimited number of elements
    
    private Animal[] AnimalList1=new Animal[5];
    private int x=0;
    
    public void add(Animal a){      //method 1
            AnimalList.add(x, a);
            System.out.println("Animal is added to index "+x);
            x++;
    }
    
    public void add1(Animal a){     // Method 2
        if(x<AnimalList1.length){
            AnimalList1[x]=a;
            System.out.println("Animal is added to index "+x);
            x++;
        }
    }
    
    public void remove(Animal a){
        
        for(int i=0;i<AnimalList.size();i++){
            
            if(AnimalList.get(i)==a){
                
               System.out.println("Animal is removed from the index "+i);
                x--;
                break;
            }
        }
    }
    
}
