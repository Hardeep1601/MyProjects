/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**Source : https://www.youtube.com/watch?v=KKbN5pjBZGM
 *
 * Was reading one of the comments in the forums about Polymorphism and why and when we need to use, so here is a good explanation, hope that helps :
 * Suppose you work for a company that sells books. So you make a very nice class called "Book" that handles everything that you need to know about a book. 
* You write all sorts of classes for billing, shipping, creating invoices, all using the Book class. One day your boss comes in and says, "Great news!
* The company is expanding and we are selling CD's now!" Not great news because now you have to change every class that uses Book to also use CD. 
* But what if you had originally created an interface (or an abstract class) called "ThingWeSell", and Book implemented this interface.
* Then you could have written all your shipping, invoicing, etc classes to use that interface instead of Book. 
* Now all you would have to do is create a new class called CompactDisc which implements the ThingWeSell interface. 
* Because of polymorphism, all of the other classes could continue to work without change!
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal obj[]=new Animal[2];
        
        //Method 1
//        dog d=new dog();
//        cow c=new cow();
//         obj[0]=d; 
//         obj[1]=c;

        //Method 2  
        obj[0]=new dog();       
        obj[1]=new cow();
        
//      for(DATATYPE IDENTIFIER/VARIABLE : ARRAY_NAME)  
        for(Animal x:obj){      // enhanced for loop 
            x.eat();
        }
        
        
        Animal a=new cow();
        Animal b=new dog();
        eat e=new eat();
        noise1 n=new noise1();
        
        e.food(a);      // the arguments are Animals, the dog or cow
        e.food(b);
        
        n.AnimalNoise(a);       // polymorphic argument
        n.AnimalNoise(b);
    
        AnimalList arr=new AnimalList();        // Counting the total number of objects created, it can only count an object as long as the object is initiated before this
        arr.add(a);
        arr.add(b);
        arr.add(obj[0]);
        arr.add(obj[1]);
        arr.remove(obj[0]);
    }
    
}
