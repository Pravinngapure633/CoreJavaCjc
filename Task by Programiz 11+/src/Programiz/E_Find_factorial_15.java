package Programiz;

import java.util.Scanner;

public class E_Find_factorial_15 {
			
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no");
			double x=sc.nextDouble();
			double fact=1;
			
			for(int i=1; i<=x; i++)
			{				
				fact *= i;
				System.out.println(i+"*"+x);
			}
			System.out.println(fact);
			 sc.close();
					
		}
}
