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
public class AnimalList {
    private Animal[] AnimalList=new Animal[5];
    private int x=0;
    
    public void add(Animal a){
        if(x<AnimalList.length){
            AnimalList[x]=a;
            System.out.println("Animal is added to index "+x);
            x++;
        }
    }
    
}
