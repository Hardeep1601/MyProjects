/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author USER
 */
//class Bike{
//  public static int speedlimit=90;
// }
// class Honda3 extends Bike{
//  Honda3(int n){
//     this.speedlimit=n;
//} 
//  public static void main(String args[]){
//   Bike obj=new Honda3(125);
//   System.out.println(obj.speedlimit);//90
// }
//}

class Bike{
  int speedlimit=90;
 }
 class Honda3 extends Bike{
  

    public void setSpeedlimit(int speedlimit) {
        this.speedlimit = speedlimit;
    }
 
  public static void main(String args[]){
   Bike obj=new Honda3();
   System.out.println(obj.speedlimit);//90
 }
}
