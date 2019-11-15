
package TutorialWork;

public class StringSplit {

    // refered from https://www.geeksforgeeks.org/split-string-java-examples/

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Method 1");
        String str = "geekss@for@geek@ss"; 
        String[] arrOfStr = str.split("@", 4); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
        
        System.out.println("\nMethod 2");
        String str1 = "geekss for geek ss"; 
        String[] arrOfStr1 = str1.split(" ", 2); 
  
        for (String a : arrOfStr1) 
            System.out.println(a); 
        
    }
    
}
