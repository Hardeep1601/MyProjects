
package TutorialWork;

public class repeatingCharacters {

    //Referred from https://beginnersbook.com/2013/12/java-string-charat-method-example/
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "BeginnersBook"; 
        
        //initialized the counter to 0
        int counter = 0;  
        
        for (int i=0; i<=str.length()-1; i++) {  
            
            // Check the occurence of a character in a string by checking each character in the string
            if(str.charAt(i) == 'B') {          
            	//increasing the counter value at each occurrence of 'B'
                counter++;  
            }  
        }  
        System.out.println("Char 'B' occurred "+counter+" times in the string");  
    }
    
}
