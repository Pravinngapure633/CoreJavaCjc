package logical;

import java.util.Scanner;

public class Numberpyramid2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many row");
		int row=sc.nextInt();
		
		int no = 1;

		for (int i = 1; i <= row; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= no; k++) {
				System.out.print(no + "");

			}
			for (int b = 2; b <= no; b++) {
				System.out.print(no + "");
			}

			System.out.println();
			no++;
		}
	}
}
//	  1
//   222
//  33333
// 4444444
//555555555
