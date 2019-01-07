import java.util.Scanner;
public class Square                 //to calc area and voldepending on no of obj passed
{
 Square(int args)
{
		System.out.println("area is"+args);
		
	}

	 Square(double volu)// why not int?? because in constructor same data type cannot be passed under same class (same as case of house children)
{
		System.out.println("volume is"+volu);
		
	}
	
	public static void main(String args[])
	{
	
Scanner define= new Scanner(System.in);
System.out.println("enter side of square");
int s2=define.nextInt();
int areaa=s2*s2;
double volu=s2*s2*s2;

Square area=new Square(areaa);//areaa is the parameter passed to displAY
Square vol=new Square(volu);//here name should be changed because in one house two person with same name can not exist
	
}
}