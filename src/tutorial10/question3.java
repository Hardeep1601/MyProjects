/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial10;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person b=new Person("amir","a");
        Person a=new Person("Chan","c");
        Person c=new Person("Bala","b");
        c.getObject();
    }
    
}

interface Comparable{
    
}

class Person implements Comparable{
    protected String name1;
    protected static ArrayList<String> object=new ArrayList<>();
    protected static ArrayList<String> name=new ArrayList<>();

    public Person(String name, String obj) {
        
        this.name.add(name);
        this.object.add(obj);
    }

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name;
    }

    public void getObject(){
        
               //Sorting the strings
        for (int i = 0; i < name.size(); i++) 
        {
            for (int j = i + 1; j < name.size(); j++) { 
                if (name.get(i).compareToIgnoreCase(name.get(j))>0) 
                {
                    String temp = name.get(i);
                    name.set(i, name.get(j));
                    name.set(j, temp);
                    
                    String temp1 = object.get(i);
                    object.set(i, object.get(j));
                    object.set(j, temp1);
                }
            }
        }
        
        for(int i=0;i<object.size();i++){
            System.out.println(object.get(i));
            System.out.println(name.get(i));
        }
    }
}