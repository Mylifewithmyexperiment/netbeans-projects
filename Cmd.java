class Cmd                                         // to print sum of digit of given no 123=6
{
public static void main(String args[]){
if(args.length==1)
{
int s1=Integer.parseInt(args[0]);
int sum=0; 
   for(int i=1; i<=3;i++)
     {s1=s1/10;
       i=s1%10;
       sum+=i;
	   
	 }
   System.out.println(sum);
}
else
	System.out.println("invalid input");
}
}	
	