/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.lang.*;
/**
 *
 * @author sj
 */
  public class Demo extends Thread{

    public Demo(String name)
    {
    super(name);
    }
    
    public void run()
    {
        System.out.println(Thread.currentThread() );
        
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
  
/**
 *
 * @author SHASHI
 */
public class Demo  {
    
        
       public static void main(String[] args) {
           
           Demo t =new Demo("first");
           t.start();
           System.out.println("This is :" +Thread.currentThread() );
       
       }  
    }
  
    

