
package Assignment5;


import java.util.Scanner;
public class SubsReplace {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the string-");
        String s=sc.nextLine();
        System.out.print("Please enter the substring-");
        String sub=sc.nextLine();
        System.out.print("Please enter the replacing substring-");
        String rep=sc.nextLine();
        s=s.replaceFirst(sub, rep);
        System.out.print("The new string is- "+s); 
    }
    
}
