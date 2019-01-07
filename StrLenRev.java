
package Assignment5;


import java.util.Scanner;
public class StrLenRev {

    public static void reverse(String s,int l) {
        char[] temp;
        temp = new char[l];
        System.out.print("The reverse of the string is- ");
        switch(l){
            case 1: System.out.println(s);
            break;
            case 2: temp[0]=s.charAt(1);
                    temp[1]=s.charAt(0);
                    System.out.println(""+temp[0]+""+temp[1]);
            break;
            case 3: temp[0]=s.charAt(2);
                    temp[1]=s.charAt(1);
                    temp[2]=s.charAt(0);
                    System.out.println(""+temp[0]+""+temp[1]+""+temp[2]);
            break;
            default: for(int i=l-1; i>=0; i--){
                        System.out.print(s.charAt(i));
                     }
                System.out.println("\n");       
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the string-");
        String s;
        int l;
        s = sc.nextLine();
        l=s.length();
        System.out.println("Thr length of the string is "+l);
        reverse(s,l);
    }
    
}
