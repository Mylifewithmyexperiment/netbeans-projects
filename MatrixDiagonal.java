
import java.util.Scanner;


 
public class MatrixDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int sum = 0,sumr=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Diagonal elements are :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j){
                    System.out.println("left diagonal "+a[i][j]);
                    sum=sum+a[i][j];
                }
                if(i+j==2)
                {
                    System.out.println("right diagonal "+a[i][j]);
                    sumr=sumr+a[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal is : "+sum);
        System.out.println("Sum of right diagonal is : "+sumr);
    }
    
}
