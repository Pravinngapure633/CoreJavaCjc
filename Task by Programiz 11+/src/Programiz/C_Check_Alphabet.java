package Programiz;

import java.util.Scanner;

public class C_Check_Alphabet {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter :");
		String s=sc.next();
		char x=s.charAt(0);
		
		if(x>='a' && x<='z' || x>='A' && x<='Z' )
		{
			System.out.println("It is alphabet"+x);
		}
		else
		{
			System.out.println("It is not alphabet"+x);
		}
		sc.close();
	}
//		
//		public static void main(String[] args) {
//					
//					char c='p';
//			if(c>='a' && c<='z' || c>='A' && c<='Z')
//				System.out.println("alphabet:"+c);
//			
//			else
//				System.out.println("it is not a alphabet:"+c);
//		}
	
	}



