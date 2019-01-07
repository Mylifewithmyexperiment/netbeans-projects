
package Assignment5;

import java.util.Scanner;

public class CharExistance {
    
       public static void main(String args[]) {
           
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter the string-");
            String s = sc.nextLine();
            System.out.println("Please enter the character to be searched in the string-");
            String s1 = sc.nextLine();
            char c1 = s1.charAt(0);

            if ((s.indexOf(c1)) != -1) {
                System.out.println("Yes! the entered character " + c1 + " exists.");
                int l = s.length();
                char c[] = new char[l];
                int cont = 0;
                System.out.println("The index of character " + c1 + " are:");
                for (int i = 0; i < l; i += 1) {
                    int b = 0;
                    c[i] = s.charAt(i);
                    int a[] = new int[l];
                    if (c1 == s.charAt(i)) {
                        System.out.println(i);
                        cont += 1;
                    }
                }
                System.out.println("The number of occurance of " + c1 + " is: " + cont);
            } 
            else {
                System.out.println("The entered character " +c1+ " does not exist.");
            }
       }
}
    

