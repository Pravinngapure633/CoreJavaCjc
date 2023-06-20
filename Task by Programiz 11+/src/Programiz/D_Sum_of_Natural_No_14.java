package Programiz;

import java.util.Scanner;

public class D_Sum_of_Natural_No_14 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter");
			
			int num=sc.nextInt();
			int sum=0;
			
			for(int i=1; i<=num; i++)
			{
				System.out.println("num:"+i);
				//sum=sum+i;
				sum +=i;
			}	
			System.out.println("Sum of Natural no:"+sum);
			
			sc.close();
		}
		
}
