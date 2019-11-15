
package Tutorial4;

import java.util.Random;

public class Q1c {

    public static void main(String[] args) {
        Random rand=new Random();
        int RandomNum,n;
        
        for(int r=0;r<24;r++){
            
            if (r%6!=0){
                
                RandomNum=rand.nextInt(20);
                n=RandomNum;
                
                if(RandomNum!=n){
                    System.out.print(RandomNum);
                    System.out.print("\t");
                    n=RandomNum;
                }
                
            }
            else
                System.out.println("");
        
        }
    }
    
}
