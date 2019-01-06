/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridingclasses;

/**
 *
 * @author SHASHI
 */
public class AndroidClass extends MobileClass {

    AndroidClass(String manu, int cost) {
        super(manu, cost);
    }

   static void getModel() {
        System.out.println("method of android class");
        //return Manufacture;
    }
}
