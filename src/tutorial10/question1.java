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
        int number=5;
        double cost=10;
        
        bulkDiscount d=new bulkDiscount(5,5);
        d.computeDiscount(number, cost);
      
        
        otherDiscount o=new otherDiscount();
        o.computeDiscount(number, cost);
        
        combineDiscount c=new combineDiscount(d,o);
        c.computeDiscount(number, cost);
        
    }
    
}

abstract class discountPolicy{
    protected int count;
    protected double discount;
    protected double itemCost;
    protected double itemsPrice;
    
    
    public abstract void computeDiscount(int count, double itemCost);

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
            System.out.println("Bulk discount : "+this.discount);
//            super.computeDiscount(count, itemCost);
        }
        else{
            System.out.println("Bulk discount : 0 ");
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
//        this.discount=1-this.discount/100;
        
        System.out.println("Other discount : "+this.discount);
//        super.computeDiscount(this.count, this.itemCost);
    }
}

class combineDiscount extends discountPolicy{
    public discountPolicy a;
    public discountPolicy b;
    
    public double num1;
    public double num2;
    
    public combineDiscount(discountPolicy a,discountPolicy b){
        this.a=a;
        this.b=b;
        this.num1=a.getDiscount();
        this.num2=b.getDiscount();
      
    }

    @Override
    public void computeDiscount(int count, double itemCost) {
        if(a.getDiscount()>b.getDiscount()){
            System.out.println("Combine discount : "+a.getDiscount());
        } else {
            System.out.println("Combine discount : "+b.getDiscount());
        }
            
    }
    
}