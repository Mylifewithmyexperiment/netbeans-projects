import java.util.Scanner;

public class Circle_switch_case{

public static void main(String args[]){
Scanner scanner = new Scanner(System.in);

System.out.println("enter radius");
int a =scanner.nextInt();
System.out.println("what you want to calculate  \ndiameter 1 ,\narea 2 ,\ncircumference 3 \nexit 4");
int abs=scanner.nextInt();
int d,ar;
float c;
switch (abs)
{
case 1:
d =(2*a);
System.out.println(d);
break;
case 2:
ar=(a*a);
System.out.println(ar);
break;
case 3:
c=a*2*(22/7);
System.out.println(c);
break;
case 4:
System.exit(0);
break;
default:
System.out.println("wrong input");
}
}
}