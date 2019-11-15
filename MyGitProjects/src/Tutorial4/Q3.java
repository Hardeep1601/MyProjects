
package Tutorial4;

public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Fn,F1=1,F2=1;
        
        for(int n=1;n<=10;n++){
            if(n<=1){
                Fn=F1+0;
                System.out.println(F1+", "+F2+ ", "+ Fn );
            }
            else{
                
                Fn=F1+F2;
                System.out.println(F1+", "+F2+ ", "+ Fn );
                F1=F2;
                F2=Fn;
                
            }
            
        }
        
        
    }
    
}
