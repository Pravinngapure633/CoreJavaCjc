package Returntype;

import java.util.Scanner;

public class D_Calculator_Scanner { // non PARAMETERIZED

	Scanner sc = new Scanner(System.in);

	public int Add() {
		System.out.println("ENTER X-1:");
		int x = sc.nextInt();

		System.out.println("ENTER Y-2");
		int y = sc.nextInt();

		int result = x + y;
		System.out.println("RESULT:" + x + "+" + y + "=" + result);
		return result;
	}

	public int Sub() {
		System.out.println("ENTER X-1:");
		int x = sc.nextInt();

		System.out.println("ENTER Y-2");
		int y = sc.nextInt();

		int result = x - y;
		System.out.println("RESULT:" + x + "-" + y + "=" + result);
		return result;
	}

	public int Multi() {
		System.out.println("ENTER X-1:");
		int x = sc.nextInt();

		System.out.println("ENTER Y-2");
		int y = sc.nextInt();

		int result = x * y;
		System.out.println("RESULT:" + x + "*" + y + "=" + result);
		return result;
	}

	public int Divi() {
		System.out.println("ENTER X-1:");
		int x = sc.nextInt();

		System.out.println("ENTER Y-2");
		int y = sc.nextInt();

		int result = x / y;
		System.out.println("RESULT:" + x + "/" + y + "=" + result);
		return result;
	}

}
