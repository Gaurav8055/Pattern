import java.util.Scanner;
 class HolidayS
{
	public static void main(String[] args) 
	{
		System.out.println("=================================================Welcome To My Software =====================================================");
		System.out.println("Choose Any One Of The Option");

		System.out.println("1.January");
		System.out.println("2.Feburay");
		System.out.println("3.March");
		System.out.println("4.April");
		System.out.println("5.May");
		System.out.println("6.June");
		System.out.println("7.July");
		System.out.println("8.August");
		System.out.println("9.September");
		System.out.println("10.Octomber");
		System.out.println("11.November");
		System.out.println("12.December");
		System.out.println("The National Holiday in This Month Is : - ");


		Scanner m = new Scanner(System.in);
		System.out.println("Enter Your Option");
		

		int op = m.nextInt();
 
               
		switch (op)
		{

		case 1:
			{
			System.out.println("26 January");
			break;
			}

		case 2:
			{
				System.out.println("18 Feburary");
				break;
			}

			case 3:
			{
				System.out.println("7 March");
				System.out.println("22 March");
				System.out.println("30 March");
				break;
			}

			case 4:
			{
				System.out.println("4 April");
				System.out.println("7 April");
				System.out.println("14 April");
				System.out.println("22 April");
				break;
			}

			case 5:
			{
				System.out.println("1 May");
				System.out.println("5 May");
				break;
			}

			case 6:
			{
				System.out.println("29 June");
				break;

			}

			case 7: 
			{
				System.out.println("29 July");
				break;
			}

			case 8:
			{
				System.out.println("15 August");
				System.out.println("16 August");
				break;

			}
			case 9 :
			{
				System.out.println("19 September");
				System.out.println("28 September");
				break;
			}

			case 10:
			{
				System.out.println("2 Octomber");
				System.out.println("24 Octomber");
				break;
			}

			case 11:
			{
				System.out.println("14 November");
				System.out.println("27 November");
				break;
			}

			case 12:
			{
				System.out.println("25 December");
				break;	
			}
			
		   default:
			{
				System.out.println("Wrong Month Entred");
			}

		
		}
          	
	}
}
 
