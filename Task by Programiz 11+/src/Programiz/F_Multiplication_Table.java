package Programiz;

import java.util.Scanner;

public class F_Multiplication_Table {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Valu :");
			long num=sc.nextLong();
			long x=1;
			for(long i=1; i<=10; i++)
			{
				 x=num*i;
				System.out.println(num+"*"+i+"="+ x);
			}
			sc.close();
		}
}
