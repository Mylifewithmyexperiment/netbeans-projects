/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package overridingclasses;

import java.util.Random;

    /**
     *
     * @author SHASHI
     */
    public class OverRidingClasses {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
        MobileClass ob1 = new AndroidClass("Huwai", 1987);  // parent class  reference and child class object
          // this is called run time polymorphism
          ob1.getModel();
             
     

    }
    }