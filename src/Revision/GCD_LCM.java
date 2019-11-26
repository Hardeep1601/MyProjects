/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

/**
 *
 * @author USER
 */
public class GCD_LCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GCD(68,119);
        GCD(119,68);
        int n=GCF(68,119);
        System.out.println(n);
        
        
        n=LCM(72,120);
        System.out.println(n);
    }
    
        public static int GCF(int a, int b) {       // method 1 GCD
        if (b == 0) { 
            return a; 
        } else { 
            return (GCF(b, a % b));
        } 
    }
    public static int GCD(int a, int b){            // method 2 GCD
        int num1=a;
        int num2=b;
        
        if(a>b){
            num1=b;
            num2=a;
        }
        
        if(b==0){           // b=num2%num1=0
            return a;       // return num1
        }
        else{
            return GCD(num1,num2%num1);
        }
    }
    
    public static int LCM(int a, int b){            // LCM method 
        int x=GCD(a,b);
        return (a*b)/x;
    }


}
