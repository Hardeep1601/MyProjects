/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuto6;

/**
 *
 * @author Hardeep
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        decreasing(1,2,3);
    }
    
    public static void decreasing(int a,int b,int c){
        int max=0,min=999,middle;
        int arr[]=new int [3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int x=0;x<3;x++){
            System.out.println(arr[x]);
        }
        
        
    }
    
}
