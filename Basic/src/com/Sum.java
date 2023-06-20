package com;

import java.util.Scanner;

public class Sum {
		int i;
		int x;
		int result=i+x;
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter vaile i:");
				int i=sc.nextInt();
				System.out.println("Enter value x:");
				int x=sc.nextInt();
				
			System.out.println("result is");
				int result=i+x;
				System.out.println("result"+i+"+"+x+"="+result);
				sc.close();
				
				
	}
}
