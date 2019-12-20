/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name[]={"Hardeep","Ahmad Ali Bin Abu ha","Amran bin Amir","Iman","Rao Murthi"};
        int age[]={12,13,46,13,12};
        
        System.out.println("Name\t\t\t Age\n");
        
        int numOfCharacters=25;
        
        for(int i=0;i<5;i++){
            System.out.print(name[i]);
            for(int j=0;j< numOfCharacters-name[i].length();j++){
                System.out.print(" ");
            }
            System.out.print(age[i]+"\n");
        }
    }
    
}
