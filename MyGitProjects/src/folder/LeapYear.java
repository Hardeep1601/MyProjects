
package folder;

import java.util.Scanner;


public class LeapYear {

    public static void main(String[] args) {
        // TODO code application logic here
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A YEAR :  ");
        year=sc.nextInt();
        if (year%4==0 && year%100!=0)                       // Statement 1
            System.out.println("It is a leap year");
        else if(year%400==0)                              //Statement 2
            System.out.println("It is a leap year");    
        else
            System.out.println("It is not a leap year");
        
        if (year%4==0 && year%100!=0 || year%400==0)   // If we combine two statements we use OR, "||"
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
        
    }
    
}
