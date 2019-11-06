
package TutorialWork;

import java.util.Random;
import java.util.Scanner;

public class BUbbleSort {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int n=sc.nextInt();
        int array[]=new int[n];
        
        System.out.println("The random numbers are : ");
        for(int i=0;i<n;i++){
            array[i]=rand.nextInt(10);
            System.out.println(array[i]);
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(array[i]<array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                    
                }
            }
        }
        System.out.println("");
        for(int x=0;x<n;x++){
            System.out.println(array[x]);
        }
        
        
    }
    
}
