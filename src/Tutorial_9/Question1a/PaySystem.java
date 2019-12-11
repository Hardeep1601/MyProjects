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
public class PaySystem {
    protected int payrate;
    protected int numOfHours;
    
    public double totalPay() {
        return this.payrate*this.numOfHours;
    }
    
}
