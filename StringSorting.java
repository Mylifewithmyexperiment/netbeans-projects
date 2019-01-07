
package Assignment5;


import java.util.Scanner;
public class StringSorting {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of strings you want to enter- ");
        int n=Integer.parseInt(sc.nextLine());
        String s[]=new String[n];
        
        System.out.println("Please enter the strings-");
        for(int i=0; i<n; i++){
            s[i]=sc.nextLine();
        }
        int a,b,l;
        String temp;
        for(int j=1; j<=n; j++){
            l=((s[j].length())>(s[j+1].length()))?(s[j].length()):(s[j+1].length());
            
           for(int x=0; x<l; x++){
                 a=s[j].charAt(x);
                 b=s[j-1].charAt(x);
                 
                  if(a>b){
                     temp=s[j-1];
                     s[j-1]=s[j];
                     s[j]=temp;
                 }
                     
            }
        }
        
        for(int k=0; k<n; k++){
            System.out.println(s[k]); 
        }
    }
    
}
