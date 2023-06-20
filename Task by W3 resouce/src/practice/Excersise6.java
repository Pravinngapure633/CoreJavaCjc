package practice;

import java.util.Scanner;

public class Excersise6 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			 System.out.println("enter-1 :");
			 int a=sc.nextInt();
			 System.out.println("Enter-2 :");
			 int b=sc.nextInt();
			 
			 int add=a+b;
			 System.out.println(a+"+"+b+"="+add);
			 
			 int sub=a-b;
			 System.out.println(a+"-"+b+"="+sub);
		
			 int multi=a*b;
			 System.out.println(a+"*"+b+"="+multi);
			 sc.close();
			 
		}
}
