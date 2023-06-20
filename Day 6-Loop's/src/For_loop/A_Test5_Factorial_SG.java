package For_loop;

import java.util.Scanner;

public class A_Test5_Factorial_SG {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
				System.out.println("ENTER VALUE");
				double num=sc.nextDouble();
				double fact=1;
			
			for(double i=1; i<=num; i++)
			{
				fact=fact*i;
				//System.out.println(fact);
			}
			System.out.println(fact);
			sc.close();
		}

}
