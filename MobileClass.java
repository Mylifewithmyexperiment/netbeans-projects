/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridingclasses;

/**
 *
 * @author SHASHI
 * 
 * If we declare get model method private  then we cannot over ride it
 */
public class MobileClass {
    
    String Manufacture;
    int cost;
    
    public MobileClass(String manu, int price) {
        this.Manufacture= manu;
        this.cost= price;
    }
    
   static void getModel(){
       System.out.println("Method of mobile class");
       //return Manufacture;
       //return getModel();
    }
            
    
}
