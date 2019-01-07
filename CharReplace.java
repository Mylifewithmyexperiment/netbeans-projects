package Assignment5;


import java.util.Scanner;

public class CharReplace {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter the string-");
            String s = sc.nextLine();
            int l=s.length();
            char[] ch=s.toCharArray();
            
            System.out.println("Please enter the position where you want to change-");
            int p=Integer.parseInt(sc.nextLine());
           
            System.out.println("Please enter the character by which you want to replace-");
            String s1=sc.nextLine();
            char c=s1.charAt(0);
            
            ch[p]=c;
            System.out.print("The new string is- ");
            for (int i = 0; i<l; i++) {
                System.out.print(ch[i]);
            }
            System.out.println("\n");
        }
}