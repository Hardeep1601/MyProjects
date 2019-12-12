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
public class SpecialPay extends PaySystem{
    
    
    public int getPayrate(){
        return payrate;
    }

    public void setPayrate(int payrate) {
        this.payrate = payrate;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }
    
//    public SpecialPay(int p,int hrs) {
//        this.payrate=p;
//        this.numOfHours=hrs;
//    }
//    public void totalPay(){
//        System.out.println(this.numOfHours*1.3);
//    }
}
