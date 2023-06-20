package Loops_Star;

public class C_Star1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {    //j=0 imp
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
