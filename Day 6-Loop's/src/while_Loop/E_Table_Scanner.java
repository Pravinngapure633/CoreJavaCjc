package while_Loop;

import java.util.Scanner;

public class E_Table_Scanner {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no :");
			double num=sc.nextDouble();
			
			int i=1;
			while(i<=10)
			{
				double d=num*i;
				System.out.println(num+"*"+i+"="+d);
				i++;
			}
			
			sc.close();
		}
}
