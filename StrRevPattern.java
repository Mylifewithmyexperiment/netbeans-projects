
package Assignment5;


import java.util.Scanner;
public class StrRevPattern {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string- ");
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        int l=s.length();
        char rev[]=new char[l];
        for(int i=l-1; i>=0; i--){
            rev[l-i-1]=c[i];
        }
        System.out.print("The reverse of the string is- " + new String(rev));
        System.out.print("\n");
        for(int j=0; j<l; j++){
            for(int k=0; k<=j; k++){
                System.out.print(rev[k]+" ");
            }
            System.out.println("");
        }
    }
    
}
