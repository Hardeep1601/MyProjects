/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial_9.Question1a;

/**
 *
 * @author USER
 */
public class Animal extends Organism{
    
    private int eat;
    
    public Animal(int size, double growthRate,int eat) {
        super(size, growthRate);
        this.eat=eat;
    }


    
    public String toString() {
        return "Animal{" + "eat=" + eat + '}';
    }
    
    
    
}
