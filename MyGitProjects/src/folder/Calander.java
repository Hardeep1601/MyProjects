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
public class Calander {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

 

        System.out.print("Enter the year: ");

        int year = scanner.nextInt();

 

        System.out.print("Enter 1st day of year ( 0 = Sunday, 6 = Satuday ): ");

        int getFirstDay = scanner.nextInt();

 

        for ( int month = 1; month <= 12; month++ ){

            int days = 0;

            String monthName = " ";

           switch (month) {

                case 1: monthName = "January";

                    days = 31;

                break;

                case 2: monthName = "February";

                    if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){

                        days = 29;

                        } else {
                            days = 28;

                           }

                break;

                case 3: monthName = "March";

                    days = 31;

                break;

                case 4: monthName = "April";

                    days = 30;

                break;

                case 5: monthName = "May";

                    days = 31;

                break;

                case 6: monthName = "June";
                    days = 30;

                break;

                case 7: monthName = "July";

                    days = 31;

                break;

                case 8: monthName = "August";

                    days = 31;

                break;

                case 9: monthName = "September";

                    days = 30;

                break;

                case 10: monthName = "October";

                    days = 31;

                break;

                case 11: monthName = "November";

                    days = 30;

                break;

                case 12: monthName = "December";

                    days = 31;

                break;

                default: System.out.print("Error: this month does not exist"); System.exit(0);

                break;

            }

 

            System.out.println("            " + monthName + " " + year);

            System.out.println("-----------------------------------");

            System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

 

            int i = 0;

            int firstDay = 0;

            switch(month){

                case 1: firstDay=getFirstDay;

                break;

                case 2: firstDay=getFirstDay+3;

                break;

                case 3: firstDay=getFirstDay+3;

                break;

                case 4: firstDay=getFirstDay+6;

                break;

                case 5: firstDay = getFirstDay + 8;

                break;

                case 6: firstDay = getFirstDay + 11;

                break;

                case 7: firstDay = getFirstDay + 13;

                break;

                case 8: firstDay = getFirstDay + 16;

                break;

                case 9: firstDay = getFirstDay + 19;

                break;
                case 10: firstDay = getFirstDay + 21;

                break;

                case 11: firstDay = getFirstDay + 24;

                break;

                case 12: firstDay = getFirstDay + 26;

                break;

            }

            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){

                switch(month){

                case 1: firstDay=getFirstDay;

                    break;

                    case 2: firstDay=getFirstDay+3;

                    break;

                    case 3: firstDay=getFirstDay+4;

                    break;

                    case 4: firstDay=getFirstDay+7;

                    break;

                    case 5: firstDay = getFirstDay + 9;

                    break;

                    case 6: firstDay = getFirstDay + 12;

                    break;

                    case 7: firstDay = getFirstDay + 14;

                    break;

                    case 8: firstDay = getFirstDay + 17;

                    break;

                    case 9: firstDay = getFirstDay + 20;

                    break;

                    case 10: firstDay = getFirstDay + 22;
                   break;

                    case 11: firstDay = getFirstDay + 25;

                    break;

                    case 12: firstDay = getFirstDay + 27;

                    break;

                }

 

}

            int dayOfWeek = 0;

            if ( (firstDay % 7 ) >= 0 ){

                if ( (firstDay % 7 ) == 0 ){

                    dayOfWeek = 0;

                } else if ( (firstDay % 7 ) == 1 ){

                    dayOfWeek = 1;

                    System.out.print("\t " );

                } else if ( (firstDay % 7 ) == 2 ){

                    dayOfWeek = 2;

                    System.out.print("\t\t  " );

                } else if ( (firstDay % 7 ) == 3 ){

                    dayOfWeek = 3;

                    System.out.print("\t\t\t   " );

                } else if ( (firstDay % 7 )  == 4 ){

                    dayOfWeek = 4;

                    System.out.print("\t\t\t\t\t" );

                } else if ( (firstDay % 7 ) == 5 ){

                    dayOfWeek = 5;

                    System.out.print("\t\t\t\t\t\t " );

                } else if ( (firstDay % 7 ) == 6 ){

                    dayOfWeek = 6;

                    System.out.print("\t\t\t\t\t\t\t  " );

                }

            }

 

            for ( i = 1; i <= days; i++ ) {

                if (i < 10)

                    System.out.print("   " + i );

                else

                    System.out.print("  " + i );

 

                if ((i + firstDay ) % 7 == 0 )

                    System.out.println();

            }

            System.out.println();

        }

    }

}

    
    

