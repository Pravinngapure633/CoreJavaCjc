package logical;

import java.util.Scanner;

public class Numberpyramid3 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many row");
		int row=sc.nextInt();
		int no = 1;

		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= no; k++) {
				System.out.print(k +" "); //k		
			}

			System.out.println();
			no++;
		}
}

}
