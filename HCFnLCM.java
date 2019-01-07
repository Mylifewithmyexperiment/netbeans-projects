
import java.util.Scanner;


public class HCFnLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no. :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int a = n1*n2;
        int hcf = 1;
        for (int i = 2; i < a; i++) {
            if((n1%i==0)&&(n2%i==0))
                hcf=i;
        }
        System.out.println("HCF of nos. is : "+hcf);
        int lcm = a/hcf;
        System.out.println("LCM is : "+lcm);
    }
    
}
