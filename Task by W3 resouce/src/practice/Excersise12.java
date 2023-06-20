package practice;

import java.util.Scanner;

public class Excersise12 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value1 :");
		float a=sc.nextFloat();
		System.out.println("Value2 :");
		float b=sc.nextFloat();
		System.out.println("Value3 :");
		float c=sc.nextFloat();
		
		float Average=(a+b+c)/3;
		System.out.println("Average is :"+Average);
		sc.close();  
	}
}
