package practice;

import java.util.Scanner;

public class Excersise7 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value :");
		int x=sc.nextInt();
		
		for(int i=1; i<=10; i++ )
		{
			System.out.println(i+"*"+x+"="+i*x);
		}
		sc.close();
	}

}
