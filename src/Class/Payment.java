/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author USER
 */
public class Payment {
    public int amount;
    public int chequeNumber;
    public String cardHolderName;
    public String cardType;
    public String expirationDate;
    public int validationCode;
    
    Payment(int a){
        amount=a;
    }
    Payment(int a,int b){
        amount=a;
        chequeNumber=b;
    }
    Payment(int a,String chn,String ct,String exp,int code){
        amount=a;
        cardHolderName=chn;
        cardType=ct;
        expirationDate=exp;
        validationCode=code;
    }
}
