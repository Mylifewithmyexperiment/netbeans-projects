
import java.util.Scanner;

public class StringChars {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String");
        String s = sc.nextLine();
        
        int len = s.length();
        System.out.println("Length "+len);
        int small = 0;
        int cap = 0;
        int space = 0;
        int sym = 0;
        int num = 0;
        int j=0;
        char[] arr = s.toCharArray();
        char[] arrs = new char[100];
        char[] arrc = new char[100];
        char[] arrn = new char[100];
        char[] arrsp = new char[100];
       // System.out.println("Len "+arr.toString());
        while(j<len){
            for (int i = 'a'; i < 'z'; i++) {
                if(arr[j]==i){
                    small++;
                    arrs[j]=arr[j];
                }
            }
            for (int i = 'A'; i < 'Z'; i++) {
                if(arr[j]==i){
                    cap++;
                    arrc[j]=arr[j];
                }
            }
            if(arr[j]==' '){
                space++;
                arrsp[j]=arr[j];
            }
            for (int i = '0'; i < '9'; i++) {
                if(arr[j]==i){
                    num++;
                    arrn[j]=arr[j];
                }
            }
            if(arr[j]!=arrs[j] && arr[j]!=arrc[j] && arr[j]!=arrsp[j] && arr[j]!=arrn[j])
                sym++;
            j++;
            
        }
        System.out.println("no. of small letters is = "+small);
        System.out.println("no. of capital letters is = "+cap);
        System.out.println("no. of spaces is = "+space);
        System.out.println("no. of integers is = "+num);
        System.out.println("no. of symbols is = "+sym);
    }
}
