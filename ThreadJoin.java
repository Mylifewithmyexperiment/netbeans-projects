/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHASHI
 */
public class ThreadJoin extends Thread{
    
    public void run(){
        for (int i = 0; i < 4; i++) {
          
        try {
            Thread.sleep(1000);
            System.out.println("thread sleep "+i);
            System.out.println(" current thread name "+ Thread.currentThread().getName()); // getting current thread name 
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadJoin.class.getName()).log(Level.SEVERE, null, ex);
        }}}    
    public static void main(String[] args) {
        
    
        try {
            ThreadJoin obj = new ThreadJoin();
            ThreadJoin obj1 = new ThreadJoin();
            ThreadJoin obj2 = new ThreadJoin();
            ThreadJoin obj3 = new ThreadJoin();
            System.out.println("thread 1 name "+obj.getName());  // getting and setting of Thread name
            obj.start();
            obj.join(); // used to emphasis that any thread which has to run will run after this thread completion
            
              obj1.start();
            obj1.join(500000);// it is just a priority checker
            obj2.start();
            obj3.start();
            obj.setName("sj");
            System.out.println("after name change " + obj.getName());
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
