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
public class NestedSwitch {
     public enum subject {dbms, csa};
    public static void main(String[] args) {
        int year=4;
        char branch ='c';
        subject [] s =subject.values();
       
        switch (year)
        {
            case 1 :
                System.out.println("year 1");
                break;
            case 4:
                System.out.println("its 4th year");
                switch  (branch){
                    case 'm':
                        System.out.println("its mechanical");
                        break;
                        
                    case 'c':
                        System.out.println("Its cse and its top subject are ");
                       
                        for(subject s1:s){ //for enhanced loop of enum
                            
                        
                        switch (s1)
                        {
                            case csa:
                                System.out.println("csa");
                                break;
                            case dbms:
                                System.out.println("dbms");
                                break;
                                default:
                                    System.out.println("no subject");
                        }
                        }
                        
                        
               break;
                    default :
                        System.out.println("check your branch");
                }
                break; // caution to put break here
            default:
                System.out.println("check your year");
        }
        
    }
    
    
}
