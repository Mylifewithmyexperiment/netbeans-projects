import java.util.Scanner;
class Leapyr
{
public static void main(String args[])
{

Scanner define=new Scanner(System.in);
System.out.println("enter the year");
int yr=define.nextInt();

if (yr%4==0 && yr/100!=0 || yr%400==0 )//means yr multiple of 100 is not a leap yr but //yr multiple of 400 is as 400/100=4 which is divisible by 100.
{
System.out.println("the entered year is a leap year");}
else
{
	
System.out.println("given year is not a leap year");
}
}
}