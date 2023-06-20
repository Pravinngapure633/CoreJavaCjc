package Break_Keyword;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1 for sunday");
		System.out.println("Enter 2 for Monday");
		System.out.println("Enter 3 for Thuesday");
		System.out.println("Enter 4 for Wednesday");
		System.out.println("Enter 5 for Thusday");
		System.out.println("Enter 6 for Friday");
		System.out.println("Enter 7 for Saturday");
		
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Sunday");
			break;
		
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Thuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thusday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;
			
		default :
			System.out.println("Enter correct no");
			break;
		}
	}

}
