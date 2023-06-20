package Returntype;

import java.util.Scanner;

public class G_Calculator_sacnner {

	// onnly one value for add and sub

	Scanner sc = new Scanner(System.in);

	int z = sc.nextInt();
	int y = sc.nextInt();

	public int Add() {
		int result = z + y;
		return result;

	}

	public int Sub() {
		int result = z - y;
		return result;

	}
}
