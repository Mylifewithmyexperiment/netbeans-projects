/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

/**
 *
 * @author SHASHI
 */
public class multithreading //implements Runnable{
        extends Thread { //1 - extending thread class other by implementing runnable inteface
// during extend to thread class, the class object is treated as thread object.
   
    public void run() {
        System.out.println("Thread is running ");
    }
    
    public static void main(String[] args) {
        multithreading obj =new multithreading();
        obj.start(); // means class object start then automaticaly run method starts. and whatever their is insicde run method it get executed 
   
       // Thread t1= new Thread(obj);
      //  t1.start();
    
    }
    
    
}
