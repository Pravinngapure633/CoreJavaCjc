package logical;

import java.util.Scanner;

public class NumberPyramid4 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how may row");
		int row=s.nextInt();
		int no=1;
		
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=no;k++)
			{
				System.out.print(k);
			}
			for(int k=no-1;k>=1;k--)
			{
				System.out.print(k);
			}
				
			System.out.println();
			no++;
		}
	
	}

}
//	   	   1
//		  121
//	     12321
//      1234321
//     123454321
//    12345654321
//   1234567654321
//  123456787654321
// 12345678987654321

//for(int i=1;i<=5;i++)
//	{
//		for(int j=5;j>=i;j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1;k<=i;k++)
//		{
//			System.out.print(k+"");
//		}
//		for(int k=i-1;k>=1;k--)
//		{
//			System.out.print(k+"");
//		}
//			
//		System.out.println