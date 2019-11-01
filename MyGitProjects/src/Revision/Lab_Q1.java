/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class Lab_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String num = "123456789";
        String ID[]=new String[5];
        
        Random rand = new Random();
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<ID.length;i++){
            char c = chars.charAt(rand.nextInt(chars.length()));
            //char n = chars.charAt(rand.nextInt(num.length()));
            int random=rand.nextInt(101);
            ID[i]=c+""+random;
            System.out.println(ID[i]);        //workerID
            
        }
        int a[]=new int[5];         // sum for each fruit respective to their ID
        int b[]=new int[5];
        int c[]=new int[5];
        int d[]=new int[5];
        int e[]=new int[5];
        int f[]=new int[5];
        int sum[]=new int[5];       // sum fpr each worker
        int total=0;                  //sum for all workers
        String maxID,minID;
        
        for(int i=0;i<ID.length;i++){
            a[i]=0;
            b[i]=0;
            c[i]=0;
            d[i]=0;
            e[i]=0;
            f[i]=0;
            sum[i]=0;
        }
        String fruits[]={"rambutan","durian","langsat","mangosteen","jackfruit","mango"};
        int n=sc.nextInt();     //n number of fruits basket
        
        
        
        
            
            for(int i=0;i<n;i++){

                int random=rand.nextInt(fruits.length);
                String ans=fruits[random];
                int max=0,min=999;
                sum[i]=0;
                
                if(ans.equals("rambutan")){
                    a[i]+=1;
                    sum[i]+=1;
                    if(a[i]>max){
                        max=a[i];
                        maxID=ID[i];
                    }
                    if(a[i]<min){
                        min=a[i];
                        minID=ID[i];
                    }
                }
                else if(ans.equals("durian")){
                    b[i]+=1;
                    sum[i]+=1;
                    if(b[i]>max)
                        max=b[i];
                    if(b[i]<min)
                        min=b[i];
                }
                else if(ans.equals("langsat")){
                    c[i]+=1;
                    sum[i]+=1;
                    if(c[i]>max)
                        max=c[i];
                    if(c[i]<min)
                        min=c[i];
                }
                else if(ans.equals("mangosteen")){
                    d[i]+=1;
                    sum[i]+=1;
                    if(d[i]>max)
                        max=d[i];
                    if(d[i]<min)
                        min=d[i];
                }
                else if(ans.equals("jackfruit")){
                    e[i]+=1;
                    sum[i]+=1;
                    if(e[i]>max)
                        max=e[i];
                    if(e[i]<min)
                        min=e[i];
                }
                else if(ans.equals("mango")){
                    f[i]+=1;
                    sum[i]+=1;
                    if(f[i]>max)
                        max=f[i];
                    if(f[i]<min)
                        min=f[i];
                }
                total+=sum[i];       //sum for all workers
            }
        for(int x=0;x<ID.length;x++){
            
        }
    }
    
}
