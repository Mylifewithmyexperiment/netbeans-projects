import java.util.Scanner;
public class Main_without                //to calc area and voldepending on no of obj passed
{
 Square(int args)
{
		System.out.println("area is" +args);
		
	}
	
Scanner define= new Scanner(System.in);
System.out.println("enter side of square");
int s2=define.nextInt();
int areaa = s2*s2;
Square area=new Square(areaa);
}

/**
*@ without main class we cannot create the output of the class
*/