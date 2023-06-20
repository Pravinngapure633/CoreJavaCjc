  package Returntype;

import java.util.Scanner;

public class H_Result_cal_para {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("num1");
		int p=sc.nextInt();
		System.out.println("num2");
		int q=sc.nextInt();
		
		H_Calculator_parametrized r = new H_Calculator_parametrized();
				r.Add(p, q);
				r.Sub(p, q);
				r.Mutli(p, q);
				sc.close();    
				
				
				
				
	}

}
