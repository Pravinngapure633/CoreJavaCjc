package while_Loop;

import java.util.Scanner;

public class D_Factorial_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		double num=sc.nextDouble();
		double fact=1;
		
		int i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		
		System.out.println("Factorial of "+num+" is "+fact);
		sc.close();
	}

}
