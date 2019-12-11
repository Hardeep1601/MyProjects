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
public class question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SavingAccount s=new SavingAccount(1500);
        System.out.println(s.computeInterest());
        
    }
    
}

interface Interest{

    public double computeInterest();
    
}

class SavingAccount implements Interest{
    
    protected double balance;
    protected double interestRate=0.5;

    public SavingAccount(double balance) {
        this.balance = balance;
    }
    
    
    @Override
    public double computeInterest() {       //yearly interest
        return this.balance*this.interestRate;
    }
    
}

class FixedAccount implements Interest{
    
    protected double balance;
    protected double interestRate=3.0;

    public FixedAccount(double balance) {
        this.balance = balance;
    }
    
    
    @Override
    public double computeInterest() {
        return this.balance*this.interestRate;
    }

}