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
public class PurchaseSystem {
    protected String productCode;
    protected double unitPrice;
    protected int quantity;
    protected double totalPrice;
    
    public void computeTotalPrice(){
        this.totalPrice=this.unitPrice*this.quantity;
    }

    @Override
    public String toString() {
        return "PurchaseSystem{" + "productCode=" + productCode + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", totalPrice=" + totalPrice + '}';
    }
    
}
