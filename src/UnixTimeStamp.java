
import java.text.DecimalFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class UnixTimeStamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // gets the time in seconds
        long ut1 = Instant.now().getEpochSecond();  // in seconds
        System.out.println(ut1);
        
        java.util.Date time=new java.util.Date((long)ut1*1000);
        
        //need to use long in order to convert UNIX timestamp to the current date and time
        long a=0;      
        int b=1;
        java.util.Date time2=new java.util.Date((long)a*1000);
        java.util.Date time3=new java.util.Date((long)Integer.valueOf(b)*1000);
        
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time3);
        
        // transform miliseconds to seconds
        long ut2 = System.currentTimeMillis() / 1000L;
        System.out.println(ut2);

        Date now = new Date();
        long ut3 = now.getTime() / 1000L;
        System.out.println(ut3);
        
        Random rand=new Random();
        DecimalFormat format = new DecimalFormat("##.####");
        int ranNum=rand.nextInt(51)+50;
        System.out.println("RanNum :" +ranNum);
        double ran=(Math.random()*11)+10;
        double d=Double.parseDouble(format.format(ran));
        System.out.println("Random number : "+d);
        
        int n=7;
        triangle(n);
        char ch=' ';
        System.out.println("Character : "+Character.isSpace(ch));
    }
    
    public static void triangle(int n){
        
        for(int j=1;j<=n;j++){
            for(int i=n-j;i>0;i--){
                System.out.print(" ");
            }
            for(int i=j;i>0;i--){
                System.out.print(i);
            }
            for(int i=2;i<=j;i++){
                System.out.print(i);
            }
            System.out.println("");
        }
        
    }
}
