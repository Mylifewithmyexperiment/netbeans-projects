/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverLoadingSampleClass;

/**
 *
 * @author SHASHI
 */
public class OverLoading {
    
  void  print(String s){
        //return s;
        System.out.println("String through overloading is  "+s);
    }
 void  print (int i)
    {
        
        System.out.println("Integer no through overloading is "+ i);
    }
 void   print (String s, int i){
        System.out.println(" overloaded string is "+ s + " and overloaded integer is "+i);
    }
 
 
 
 
}
class  OverloadDemo {
      
     public static void main(String[] args) {
          OverLoading ob = new OverLoading();
          System.out.println(" sj");
      ob.print("sj");
        ob.print(99);
        ob.print("reliance", 33);
     }
     
 }
 