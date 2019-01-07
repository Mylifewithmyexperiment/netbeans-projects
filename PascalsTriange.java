
package pascalstriange;
import java.util.Scanner;
public class PascalsTriange {

  static long fact (int f){
       
       
        long f1=1;
      // int k=1;
     
     //while(k<=f)
          for (int k = 1; k <=f ; k++) {
              
          

           f1=f1*k;
          // k++;
      }
       return f1;
   }
           
         
    public static void main(String[] args) {
      

        Scanner definee=new Scanner(System.in);
        System.out.println("enter the no of line u wish to print pascals triangle");
        int n=definee.nextInt();
       
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n-i-1; j++) 
                System.out.print(" ");
            
                for ( int j = 0; j <= i; j++) 
                    System.out.print(fact(i)/(fact(j)*fact(i-j)));
                 
                    System.out.print("\n");
           
        }
        
    }
    
}
