import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter nUMBER");
		int num = sc.nextInt();

	      int sum = 0;
		  while (num != 0)
		  {
			  int sq = num * num;

			  for (int i = sq; i > 0 ; i/=10 )
			  {
				  int rem = i % 10;

				   sum = sum + rem;
			  }
			  System.out.println("The Square Of Num is"+" "+sq);
			  break;
		  }
		  System.out.println("The Sum Of Square Is"+" "+sum);

		  if (num == sum)
		  {
			  System.out.println("The Number Is Neon");
		  }
		  else
		{
			System.out.println("Number Is Not Neon");
		}
	}
}
