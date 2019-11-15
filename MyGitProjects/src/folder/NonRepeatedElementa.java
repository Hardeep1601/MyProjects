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
public class NonRepeatedElementa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,flag=0,count=0;
        System.out.println("Enter the size of the array :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the array elements :");
        int a[]=new int[n];  //create array size of n
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(a[i]!=a[j])
                    {
                        flag=1;
                    } 
                    else
                    {
                        flag=0;
                        break;
                    }
                }
            }if(flag==1){
                count++;
                    System.out.println(a[i]+" ");
            }
        }        System.out.println();
    }
    
}
