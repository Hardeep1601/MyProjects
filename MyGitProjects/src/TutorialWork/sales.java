
package TutorialWork;

import java.util.Scanner;

public class sales {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double total_sales=0,sales;
        
        System.out.println("Enter the durian type :");
        String durian_type=sc.next();
        
        
        while(!durian_type.equals("quit")){
            System.out.println("Enter the sales in kg :");
            sales=sc.nextDouble();
            switch(durian_type){
                case "MK":
                    total_sales+=25*sales;
                case "HL":
                    total_sales+=22*sales;
                case "D@4":
                    total_sales+=20*sales;
                case "UM":
                    total_sales+=18*sales;
                
            }
            System.out.println("Enter the durian type :");
            durian_type=sc.next();
            
        }
        System.out.println("The total sales is "+ total_sales);
    }
    
}
