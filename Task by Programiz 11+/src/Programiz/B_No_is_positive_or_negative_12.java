package Programiz;

import java.util.Scanner;

public class B_No_is_positive_or_negative_12 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value");
			long num=sc.nextLong();
			
			if(num>0)
				System.out.println("No is Positive :"+num);
				
			else if(num<0)
				System.out.println("No is Negative"+num);
			sc.close();
		}
		
//	 public static void main(String[] args) {
//		
//		 		double num=-10;
//		 		
//		 	if(num>0)
//		 		System.out.println("No is Positive :"+num);
//		 	
//		 	else if(num<0)
//				System.out.println("No is Negative"+num);
//			
//		 		
//	}
}
