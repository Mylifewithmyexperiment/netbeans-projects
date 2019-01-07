import java.util.Scanner;
public class Multiconstructor//to execute more than one const on creation of single object
{
	public Multiconstructor(int args)
	{
		System.out.println("integer parameter is"+args);
		
	}

	public Multiconstructor(String arg)

	{
		System.out.println(" string parameter is  "+arg);
		
	}

	public static void main(String args[])
	{
	
Scanner define= new Scanner(System.in);
System.out.println("enter string parameter");
String s1=define.nextLine();

System.out.println("enter the integer parameter ");
int s2=define.nextInt();
	
	Multiconstructor m1= new Multiconstructor(s1);
	Multiconstructor m2= new Multiconstructor(s2);
	
	/**an eg of documentation comments
	*@shashi
	*@jaiswal
	*/
	}
}



