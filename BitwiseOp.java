import java.util.Scanner;

class BitwiseOp
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st No. : ");
		int a=s.nextInt();
		System.out.println("Enter 2nd No. : ");
		int b=s.nextInt();
		int c;
		c=a|b;
		System.out.println("BitwiseOR Operation Result is : "+c);
		c=a&b;
		System.out.println("BitwiseAND Operation Result is : "+c);
		c=~a;
		System.out.println("NOT Operation of A Result is : "+c);
		c=a<<2;
		System.out.println("RIGHT SHIFT Operation Result is : "+c);
		c=a>>2;
		System.out.println("LEFT SHIFT Operation Result is : "+c);
		c=a^b;
		System.out.println("XOR Operation Result is : "+c);
	}
}