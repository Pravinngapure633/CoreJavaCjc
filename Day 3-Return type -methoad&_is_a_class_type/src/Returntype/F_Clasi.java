package Returntype;

import java.util.Scanner;

public class F_Clasi {

	int x;
	int y;

	Scanner s = new Scanner(System.in);

	public int Add() {
		System.out.println("Enter1");
		x = s.nextInt();          //int or without int
		System.out.println("Enter2");
		y = s.nextInt();

		int result = x + y;
		return result;
	}

	public int Sub() {
		System.out.println("Enter1");
		int x = s.nextInt();
		System.out.println("Enter2");
		int y = s.nextInt();

		int result = x - y;
		return result;
	}

}
