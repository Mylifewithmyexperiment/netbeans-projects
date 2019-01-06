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
public class THreadGroup implements Runnable{ //extends Thread{
    
    @Override
    public void run() {
       
        System.out.println(Thread.currentThread().getName() );
     }
    
    public static void main(String[] args) {
        
        THreadGroup obj = new THreadGroup ();
        //obj.start();
        ThreadGroup tg = new ThreadGroup("parent thread group name ");
        
        
        Thread t1 = new Thread(tg,obj,"first thread" );
        t1.start();
        Thread t2 = new Thread(tg,obj,"second thread ");
        t2.start();
        
        System.out.println("the thread group name is " + tg.getName());
     tg.list();
    }

    
    
    
    
}
