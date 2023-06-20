package logical;

import java.util.Scanner;

public class A {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many row");
		int row=sc.nextInt();
		int no=1;
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=row;k++)
			{
				System.out.print(k);
			}
			for(int k=row-1;k>=i;k--)
			{
				System.out.print(k);
			}
			
			System.out.println();
			no++;
		}
		
	}

}
