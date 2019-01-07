
package Assignment5;


import java.util.Scanner;
public class MyStr {
    
    static void match(String s1,String s2){
        
        if(s1.equals(s2)){
            System.out.println("Both the strings are same.");
        }
        else{
            System.out.println("The strings are not same.");
        }
        
    }
    
    static void concat(String s1,String s2){
        
        System.out.println("The concated string is- "+s1.concat(s2));
        
    }
    
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the first string- ");
        String s1=sc.nextLine();
        System.out.print("Please enter the second string- ");
        String s2=sc.nextLine();
        System.out.print("Whst do want to perform- EqualityCheck(EC)/Concatanation(C)- ");
        String s3=sc.nextLine();
        
        if(s3.equals("ec")|| s3.equals("EC")|| s3.equals("Ec")|| s3.equals("eC")){
            match(s1,s2);
        }
        else if(s3.equals("C")|| s3.equals("c")){
            concat(s1,s2);
        }
        else{
            System.out.println("Please enter the correct choice!");
        }
        
    }
    
}
