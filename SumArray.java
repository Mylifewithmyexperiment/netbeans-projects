
import java.util.Scanner;


public class SumArray {
    int array[];
    int sum=0;
    SumArray(int a[]){
        array=a;
    }
    
    public void sumArr(){
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println("Sum of array is :"+sum);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array :");
        int len = sc.nextInt();
        int a[] = new int[len];
        for (int i = 0; i < len; i++) {
            a[i]=sc.nextInt();
        }
        
        SumArray sa = new SumArray(a);
        
        /*for (int i = 0; i < len; i++) {
            sa = new SumArray(a[i]);
        }*/
        sa.sumArr();
    }
    
}
