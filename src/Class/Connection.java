/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author USER
 */
public class Connection {
    public static int numberofobjects=0;

    Connection(){
        numberofobjects++;
    }
    
    public void disconnect(){
        numberofobjects--;
    }
    
    public void ConnectionNumber(){
        System.out.println ("There are " + Connection.numberofobjects + " objects in this class");    
    }
}
