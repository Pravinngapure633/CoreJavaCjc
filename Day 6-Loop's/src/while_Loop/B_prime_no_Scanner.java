package while_Loop;

import java.util.Scanner;

public class B_prime_no_Scanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int count=0;
		
		int i=1;
		while(i<=num)
		{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("Number is Prime :"+num);
		}
		else
		{
			System.out.println("Number is not a prime :"+num);
		}
		sc.close();	
	}
}
