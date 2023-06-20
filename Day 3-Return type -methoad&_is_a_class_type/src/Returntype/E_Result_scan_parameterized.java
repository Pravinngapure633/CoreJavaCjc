 package Returntype;

import java.util.Scanner;

public class E_Result_scan_parameterized {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		E_Calculator_Scan_parameterized c = new E_Calculator_Scan_parameterized();
		System.out.println("Enter X & Y");
		
		c.Add(sc.nextInt(), sc.nextInt());
		System.out.println("ENTER X & Y");
		
		c.Sub(sc.nextInt(), sc.nextInt());
		System.out.println("ENTER X & Y");
		
		c.Multi(sc.nextInt(), sc.nextInt());
		System.out.println("ENTER X & Y");
		  
		c.Divi(sc.nextInt(), sc.nextInt());
		
		
		sc.close();
	}
}
