/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class stringSplit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="2012-12-16 05:08:37,905 [Thread-1] INFO  com.submit.SubmitService - Wait time 500";
        String arr[]=str.split("\\s");
        
        System.out.println("String length : " + arr.length);
        String date;
        String time;
        for(String x:arr){
//            System.out.println("");
//            System.out.println(x);
            
            if(x==arr[0]){
                date=arr[0];
                System.out.println("Date :"+date);
            }
            else if(x==arr[1]){
                time=arr[1];
                String arr2[]=time.split(",");
                time=arr2[0];
                String refNum=arr2[1];
                System.out.println("Time :"+time);
                System.out.println("Reference Number : "+refNum);
            }
            else if(x==arr[5]){
                String site=arr[5];
                System.out.println("Site : "+site);
            }
            else if(x==arr[9]){
                String waitTime=arr[9];
                System.out.println("Wait time : "+waitTime);
            }
            
//            switch(x){
//                case arr[0]:
//                    break;
//            }
        }
    }
    
}
