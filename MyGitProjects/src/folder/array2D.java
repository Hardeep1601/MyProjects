/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author Hardeep
 */
public class array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int scores[][]=new int[3][3];
        int sum=1;
        int[][] lottery={ {1,5,7},
                          {3,6,9},
                          {5,3,8} };
        
        //Normal 2D arraysZ
               
        for(int i=0;i<lottery.length;i++){
            for(int j=0;j<lottery.length;j++){
                System.out.print(lottery[i][j]);
                System.out.print("\t");
                if(sum%3==0){
                    System.out.println(" ");}
                sum+=1;
                
            }
        
        }
        System.out.println("\n----------------------------\n");
//        // Rotate the array 90 degrees clockwise
        
        for(int j=0;j<lottery.length;j++){
            for(int i=0;i<lottery.length;i++){
                System.out.print(lottery[2-i][j]);
                System.out.print("\t");
                
                if(sum%3==0){
                    System.out.println(" ");}
                sum+=1;
                
            }
        
        }
        
        System.out.println("\n----------------------------\n");
        // Ragged or Jagged arrays
        
        int arrays[][]=new int[3][];
        arrays[0]=new int[4];
        arrays[1]=new int[3];
        arrays[2]=new int[2];
        
        int array1[]={78,23,94,3,24,18,29,74,48};
        for(int i=1;i<array1.length;i++){
            for(int j=i;j>0;j--){
                if(array1[j]<array1[j-1]){
                    int temp=array1[j];
                    array1[j]=array1[j+1];
                    array1[j-1]=temp;
                }
            }
        }
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
    }
    
}
