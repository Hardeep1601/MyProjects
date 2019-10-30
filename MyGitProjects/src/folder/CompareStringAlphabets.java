
package folder;

import java.util.Scanner;

public class CompareStringAlphabets {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="Hello",b="World";
        
        System.out.println(a.compareToIgnoreCase(b));
        if(a.compareToIgnoreCase(b)<0)
            System.out.println(a+" "+b);
        else if(a.compareToIgnoreCase(b)>0)
            System.out.println(b+" "+a);
    }
    
}
