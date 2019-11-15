
package folder;

import java.util.Random;

public class T5Q6_8bitArray {

    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        
        int decimal=rand.nextInt(256);
        int binary;
        int store[]=new int[8];
        int rem;
        System.out.println(decimal);
        for(int i=0;decimal>0;i++){
            rem=decimal%2;
            store[i]=store[i]+rem;
            decimal=decimal/2;
        }
        for(int j=store.length-1;j>=0;j--){
            System.out.print(store[j]);
        }
        
        
        
        
        
        
        
        
        
//        while(decimal>0){
//            rem=decimal%2;
//            
//            store=store+""+rem;
//            decimal=decimal/2;
//        }
//        for(int i=store.length()-1;i>=0;i--){
//            System.out.println(store.charAt(i);
//        }
        
        
        
        
    }
    
}
