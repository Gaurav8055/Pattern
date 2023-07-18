import java.util.Scanner;
class  IncreS
{
	public static void main(String[] args) 
	{
        Scanner i = new Scanner(System.in);

		System.out.println("ENTER Your 1st number");
		int ip1 = i.nextInt();

		System.out.println("Enter Your 2 nd Number");
		int ip2 = i.nextInt();

		  if (ip1 > ip2 )
		  {
			  System.out.println(ip1+""+"is grater");
		  }
		  else if (ip2 > ip1)
		  {
			  System.out.println(ip2+""+"is grater");
		  }  
		  else 
		{
			System.out.println("both mumber are equal");
		}
		System.out.println("Thank You");
	}
}
