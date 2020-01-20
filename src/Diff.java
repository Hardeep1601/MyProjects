/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Diff {
    
}


//  more from : https://www.tutorialspoint.com/java/java_generics.htm
class Box<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
      Box<Integer> integerBox = new Box<Integer>();
      Box<String> stringBox = new Box<String>();
    
      integerBox.add(new Integer(10));
      
      
//      integerBox.add(new int(10));        cannot be declared as int cuz it will assume it it referring to an integer array, use the full name of "Integer" instead of "int"
      
//      int a=32;               if a variable is declared as an int(or integer) already, the variable can be used in adding the to the object(it is able to read the data type of the variable)
//      integerBox.add(a);
      
      stringBox.add(new String("Hello World"));

      System.out.printf("Integer Value :%d\n\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());
   }
}