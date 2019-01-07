package Assignment5;


import java.util.Scanner;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Please enter the string- ");
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        int l=s.length();
        int count1=0,count2=0,count3=0,count4=0,count5=0;
        int asci;
       
        for (int i=0; i<l; i++) {
          asci=c[i];
           if(asci>=97 && asci<=122){
               count2++;
               count1++;
           }
           else if(asci>=65 && asci<=90){
              count3++;
              count1++;
          }
           else if(c[i]==' '){
               count4++;
           }
           else{
               count5++;
               count1++;           }
           
        }
        System.out.println("The no of small letters are- "+count2);
        System.out.println("The no of capital letters are- "+count3);
        System.out.println("The no of spaces are- "+count4);
        System.out.println("The no of symbols are- "+count5);
        System.out.println("The total no of characters are- "+count1);
    }

}
