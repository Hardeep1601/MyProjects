/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class Calander1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the year :");
        int year = sc.nextInt();
        
        System.out.println("Enter the first day of the year(0 for Sunday, 1 for Monday, … , 6 for Saturday) :");
        int FirstDayOfYear=sc.nextInt();
        
        int AugustDays=31,MayDays=31;
        
        System.out.println(" May "+year);
        System.out.println("Sun \t Mon \t Tues \t Wed \t Thurs \t Fri \t Sat");
        System.out.println("******************************************************");

        int FirstDayOfMonth;
        FirstDayOfMonth=FirstDayOfYear+8;
        int days=7;
        for(int i=1;i<=MayDays;i++){
            if (i < 10){
                System.out.print(i + "\t" );}

                else
                    System.out.print( i + "\t");

                 if ((i + FirstDayOfMonth ) % 7 == 0 )
                    System.out.println();
        }
        
        FirstDayOfMonth=FirstDayOfYear+16;
        System.out.println(" ");
        System.out.println(" August "+year);
        System.out.println("Sun \t Mon \t Tues \t Wed \t Thurs \t Fri \t Sat");
        System.out.println("******************************************************");

        for(int i=1;i<=AugustDays;i++){
            if (i < 10){
                    System.out.print(i + "\t" );}

                else
                    System.out.print( i + "\t");

        if ((i + FirstDayOfMonth ) % 7 == 0 )
                    System.out.println();
        }
        
    }
    
}
