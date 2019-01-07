
package Assignment5;


import java.util.Scanner;
public class LineRev {
    
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the line- ");
      String line=sc.nextLine();
      char c[]=line.toCharArray();
      
      int count=0;
      for(int i=0; i<line.length(); i++){
        if(c[i]==' ')
            count++;
      }
       
      String s[]=new String[count+1];
      char temp[]=new char[line.length()];
     
      for(int j=0,k=0,l=0; j<count+1; j++){
          l=0;
          while(c[k]!=' '){
              temp[l]=c[k];
              l++;
              k++;
          }
          k++;
          s[j]=new String(temp);
          
          for(int y=0; y<line.length(); y++){
              c[y]=' ';
          }
      }
      
      
      for(int x=count; x>=0; x--){
          System.out.print(" "+s[x]);
      }
              
    }
}
