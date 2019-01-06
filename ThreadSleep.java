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
public class ThreadSleep extends Thread {
    
       
    public void run (){ 
           
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000) ;
                System.out.println("thread is about to sleep"+i); // repeated for 1 sec interval
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
}
    public static void main(String[] args) {
        ThreadSleep obj = new ThreadSleep();
       // obj.start();
        
       
        //obj.start();// this shows that we can start a thread twice but only by taking different references 
       //obj.stop();
       
         ThreadSleep obj1 = new ThreadSleep();
        //when two run method are called simultaneously then they are treated as seperate object and are executed seperately
         obj.run();
        obj1.start();
        // calling run method directly will run the run method directly
     //   obj1.run();
    }
    
}
