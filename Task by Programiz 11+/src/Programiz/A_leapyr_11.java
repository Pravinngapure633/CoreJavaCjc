package Programiz;

import java.util.Scanner;

public class A_leapyr_11 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Year");
			int num=sc.nextInt();
			
			if(num % 4==0)
			{
				System.out.println("leap yr :"+num);
			}
			else
			{
				System.out.println("no leap yr :"+num);
			}
			sc.close();
		}

}
