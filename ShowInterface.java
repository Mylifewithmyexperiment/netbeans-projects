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

 interface Showable{
    void show();
    
static final class a{
   static final int data=1;// we can create class inside interface
}

interface Message{   // by writting interface only we can create intrerface
    void msg();
    
}
}

public class ShowInterface implements Showable.Message {

    @Override
    public void msg() {System.out.println("i am in nested interface ");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        ShowInterface obj = new ShowInterface();
        obj.msg();
    }
}
