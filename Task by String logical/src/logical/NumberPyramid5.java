package logical;

import java.util.Scanner;

public class NumberPyramid5 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many row");
		int row=sc.nextInt();
		int no=row;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=no;j++)
			{
				System.out.print(j+"");
			}
			for(int k=no-1;k>=1;k--)
			{
				System.out.print(k+"");
			}
			System.out.println();	
			no--;
		}
	}
}
 //12345678987654321
// 123456787654321
//  1234567654321
//   12345654321
//    123454321
//     1234321
//      12321
//       121
//        1
