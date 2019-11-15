package folder;

import java.util.Scanner;


public class Question7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double inch;
        double conversion;  
        inch=sc.nextDouble();
        //inch=20.17;
        conversion = inch*0.0254;
        System.out.println("Enter value in inch : "+inch);
        System.out.print(inch+" inches = ");
        System.out.printf("%.2f",conversion);
        System.out.print(" meters\n");
    }
    
}
