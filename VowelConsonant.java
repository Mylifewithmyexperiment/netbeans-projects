
import java.util.Scanner;


public class VowelConsonant {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String");
        String s = sc.nextLine();
        
        int len = s.length();
        int countv=0;
        int countc=0;
        
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < len; i++) {
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
                countv++;
            else
                countc++;
        }
        System.out.println("No. of vowels is = "+countv);
        System.out.println("No. of consonants is = "+countc);
        
    }
    
}
