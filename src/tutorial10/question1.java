/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial10;

/**
 *
 * @author USER
 */
public class question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bulkDiscount d=new bulkDiscount(1,0.9);
        d.computeDiscount(3, 5.0);
        
        System.out.println("\nNext Object\n");
        
        otherDiscount o=new otherDiscount();
        o.computeDiscount(7, 10.0);
        
    }
    
}

abstract class discountPolicy{
    protected int count;
    protected double discount;
    protected double itemCost;
    protected double itemsPrice;
    
    
    public void computeDiscount(int count, double itemCost){
        this.count=count;
        this.itemCost=itemCost;
        
        this.itemsPrice=this.discount*this.itemCost*this.count;
        System.out.println(this.itemsPrice);
    }

    public double getDiscount() {
        return this.discount;
    }
    
    
}

class bulkDiscount extends discountPolicy{

    protected int min;
    
    public bulkDiscount(int minimum, double discountRate) {
        this.min=minimum;
        this.discount=discountRate;
    }
    
    public void computeDiscount(int count, double itemCost){
        this.count=count;
        this.itemCost=itemCost;
        
        if(this.min<this.count){
            super.computeDiscount(count, itemCost);
        }
        else{
            System.out.println("NO discount is given !!!");
        }
    }
}

class otherDiscount extends discountPolicy{
    
    public void computeDiscount(int count, double itemCost){
        this.count=count;
        this.itemCost=itemCost;
        
        if(this.count<3){
            this.discount=0;
        }
        else if(this.count<6){
            this.discount=10;
        }
        else if(this.count<9){
            this.discount=20;
        }
        else{
            this.discount=30;
        }
        this.discount=1-this.discount/100;
        
        System.out.println(this.discount);
        super.computeDiscount(this.count, this.itemCost);
    }
}

class combineDiscount extends discountPolicy{
    public double computeDiscount(discountPolicy a,discountPolicy b){
        double x=a.getDiscount();
        double y=b.getDiscount();
        
        return Math.max(x, y);
        
    }
}