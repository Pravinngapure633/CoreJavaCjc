package Programiz;

import java.util.Scanner;

public class G_Fibonacci_Series {

	public static void main(String[] args) {
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter");
			   int n=sc.nextInt();
				//int n=10;
			   int first=0;
			   int second=1;
			   
			   for(int i=1;i<=n; ++i)
			   {
				   System.out.print(first+" , ");
				   //formula for fibonacci
				   int next=first+second;
				   first=second;
				   second=next;
				   
			   }
			   sc.close(); 

	}

}
