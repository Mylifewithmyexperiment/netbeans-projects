
package Assignment5;


import java.util.Scanner;
public class ContVolCons {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the string-");
        String s;
        int l,count1=0,count2=0;
        s = sc.nextLine();
        char[] c;
        c = s.toCharArray();
        l=s.length();
        for(int i=0; i<l; i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' ||c[i]=='o'||c[i]=='u'|| c[i]=='A' || c[i]=='E' || c[i]=='I' ||c[i]=='O'||c[i]=='u'){
                count1++;
            }
            else if(c[i]!=' '){
                count2++;
            }
        }
        System.out.println("The no of vowels in the string is "+count1);
        System.out.println("The no of consonents in the string is "+count2);
    }

}