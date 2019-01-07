class Fruit
{
     string name;
	 int qty;
	double price;

 Fruit(String a,int b,int c);//const a fn with class name and no return type
{
name =a;
qty=b;
price=c;
}
void displayFruit(){

System.out.println(name);
System.out.println(quantity);
System.out.println(price);

}
public static void main (String args [])

{
Scanner ss = new Scanner (System.in);// defining scanner fuction 
System.out.println("enter name of fruit ");

String f = ss.nextline();//name of fruit stored in abc


System.out.println("enter no of qyantity ");

String q = ss.nextInt();

System.out.println("enter price ");

String p = ss.nextDouble();


Fruit f1 = new Fruit (f,q,p);
f1.displayFruit();

Fruit f2 = new Fruit (f,q,p);
f2.displayFruit();





}

















}