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
public class SugerPurchase extends PurchaseSystem{

    protected double sugarWeight;
    
    public void computeTotalPrice(){
        this.totalPrice=this.unitPrice*this.sugarWeight;
    }

}
