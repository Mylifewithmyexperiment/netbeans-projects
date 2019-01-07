
package Assignment5;

import java.util.Scanner;
public class AddHp {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the string- ");
        String s=sc.nextLine();
        char c=s.charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            s=s+"hp";
        }
        else{
            s=s.substring(1)+"hp";
        }
        System.out.print("The new string is- "+s);
    }
            
    
}
