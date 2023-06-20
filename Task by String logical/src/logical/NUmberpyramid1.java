package logical;

import java.util.Scanner;

public class NUmberpyramid1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many row");
		int row=sc.nextInt();
		int no = 1;

		for (int i = 1; i <= row; i++) 
		{
			for (int j = row; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= no; k++) 
			{
				System.out.print(no + " "); //no+" "

			}
//			for(int b=2;b<=no;b++)
//			{
//				System.out.print(no+"");
//			}

			System.out.println();
			no++;
		}
	}
}
//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 