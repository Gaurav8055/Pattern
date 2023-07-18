import java.util.Scanner;

class TimeTableS 
{
	public static void main(String[] args) 
	{
		System.out.println("=============================Welcome to Gk ==============================================");
		System.out.println("Please Select From Mention option ");

        

		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3.Wenesday");
		System.out.println("4. ThursDay");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7.Sunday");

		Scanner m = new Scanner(System.in);

		System.out.println("Enter Your Option");

		int op = m.nextInt();

		switch (op)
		{
	     	case 1 :
			{
				System.out.println("Study Marathi");
                break;
			}
			case 2 :
			{
				System.out.println("Pratice Maths");
				 break;
			}
			case 3 :
			{
				System.out.println("Learn History");
				  break;
			}
			case 4 :
			{
				System.out.println("Explore Geography");
				  break;
			}
			case 5 :
			{
				System.out.println("Experement Science");
				  break;
			}
			case 6 :
			{
				System.out.println("Speak In English");
				  break;
			}
			case 7 :
			{
				System.out.println("Enjoy Sunday!! Play And Enjoy");
				  break;
			}
			default :
			{
				System.out.println("Wrong i/p entred");
			}
		
		}


	}
}
