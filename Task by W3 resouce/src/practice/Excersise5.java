package practice;

import java.util.Scanner;

public class Excersise5 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			 System.out.println("enter-1 :");
			 int a=sc.nextInt();
			 System.out.println("Enter-2 :");
			 int b=sc.nextInt();
			 int result=a*b;
			 System.out.println(a+"*"+b+"="+result);
			sc.close();
		}
}
