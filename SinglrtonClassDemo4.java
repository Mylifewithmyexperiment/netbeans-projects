/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlrtonclassdemo4;

/**
 *
 * @author SHASHI
 */
public class SinglrtonClassDemo4 {

    /**
     * @param args the command line arguments
     */
    
    private static  SinglrtonClassDemo4 myobject;  // class object 
    
    private SinglrtonClassDemo4()  //default constructor
    {
    }
        public static SinglrtonClassDemo4 getInstance1() // class method
        {
            if(myobject==null){                                 // class object should be non empty and come out from here
                myobject = new SinglrtonClassDemo4();   // if empty reinitialize
            }
            return myobject;     
                
    }
        
        public void doSomething()
        {
            System.out.println("I am here .. in do something ");
        }
            
            
    
    public static void main(String[] args) {
        // TODO code application logic here
        SinglrtonClassDemo4 obj  = SinglrtonClassDemo4.getInstance1();
        obj.doSomething();
        
        
    }
    
}
/**
 * 4 things 
 * class obj
 * default constructor
 * class method :- here only instantiation 
 *  
 * sample method which is called in run 
 * 
 * remember while calling class name with class method should be callled.
 * 
 * 
 */