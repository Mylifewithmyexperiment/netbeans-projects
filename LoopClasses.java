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
public class LoopClasses {
static int i=5;
    
    public static void main(String[] args) {
//      while(true)  { // while infinite loop
//          System.out.println("the value of i is "+i);
//      }

//        do {            
//            System.out.println(" "+i);
//        } while (true); // infinite loop

//        do {     
//            i++;
//            System.out.println(""+i);
//            break;  // use of break
//        } while (i<10);

// labeled for loop
//aa:
//
//        for (int j = 0; j < 10; j++) {
//            System.out.println(" "+j);
//            for (int k = 0; k < 10; k++) {
//                if(j==k)
//                {
//                  break aa;
//                  
//                }
//            }
//        }
//System.out.println(" i am out aa");


         for (int j = 0; j < 5; j++) {
             
             if (j==3) {
              continue; // when j==3 it redirect back to for loop and do not let it go to print j value at 3
                //  System.out.println("ok "); unreachable
             }
             
             System.out.println(" "+ j);
       }


//
//// java for each loop 
//
//int ar[] = {2,3,4,5};
//
//for(int i:ar)
//{
//    System.out.println(" "+i);
//}
//

    }
    
}
