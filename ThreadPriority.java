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
public class ThreadPriority extends Thread {
    
    public void run (){
        try {
            for (int i = 0; i < 4; i++) {
                 Thread.sleep(1000);
                  System.out.println("The current thread is  " +i+"  ," +Thread.currentThread().getName());
            }
           
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadPriority.class.getName()).log(Level.SEVERE, null, ex);
        }
  
}
    public static void main(String[] args) {
        ThreadPriority obj = new ThreadPriority();
         ThreadPriority obj1 = new ThreadPriority();
        obj.setPriority(Thread.MIN_PRIORITY);
        obj1.setPriority(Thread.MAX_PRIORITY);
        
        obj.start();
        obj1.start();
        //its all about priotising the threads
    }
    
}
