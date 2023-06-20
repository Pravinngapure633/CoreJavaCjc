package For_loop;

import java.util.Scanner;

public class A_Test3_Prime_Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER VALUE");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No is PRIME :" + num);

		} else {
			System.out.println("No is NOT Prime :" + num);
		}
		sc.close();
	}

}
