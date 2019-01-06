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
public class WorkerThreadPool extends Thread{

    private String messsage;
    
    public WorkerThreadPool(String s)  // here constructor is created to put messahe in thread 
    {
        this.messsage=s;
    }
    
    @Override
    public void run() {
        
        System.out.println( Thread.currentThread().getName()+  " the message is " +messsage); 
        threadSleep();  // just for sleeping thread for 2 sec .. we can use thread.sleep here also
        
        System.out.println("The current thread now is  " + Thread.currentThread().getName());
    }
    
    // to make code modularise
    
    void threadSleep()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WorkerThreadPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public static void main(String[] args) {
        WorkerThreadPool obj = new WorkerThreadPool("SHASHI JAISWAL");
       obj.start();
        
        
    }
    
}
