import java.util.Scanner;

class Reverse//prog to calc length and reverse the string
{
public static void main(String args[])
{
Scanner define =new Scanner(System.in);
System.out.println("enter the string");
String abs=define.nextLine();
//int num =Integer.parseInt(args[0]);
System.out.println("1 length\n 2 reverse");
int num = define.nextInt();//taking input from user

//using switch case
switch (num) {

case 1:
System.out.println("the length of the string is "+abs.length());//printing the length
break;
case 2:
int n=abs.length();
 
for(int i =(n-1); i>-1;i--)

{
System.out.print(abs.charAt(i));

}




//switch closed
}


//end comments
}
}
