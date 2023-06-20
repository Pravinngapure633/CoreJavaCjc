package while_Loop;

import java.util.Scanner;

public class C_Even_odd_Scanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no :");
		int num=sc.nextInt();
		
		int i=num;
		while(i<=num)
		{
			if(num%2==0)
			{
				System.out.println("Even:"+num);
			}
			else
			{
				System.out.println("Odd:"+num);
			}
			i++;
		}
		sc.close();
	}

}
