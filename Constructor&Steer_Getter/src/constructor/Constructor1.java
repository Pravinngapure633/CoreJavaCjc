package constructor;

import java.util.Scanner;

public class Constructor1 {
	

	float x;
	Scanner sc = new Scanner(System.in);
	
	public Constructor1()
	{
		System.out.println("Enter value");
		float x=sc.nextFloat();
		
		if(x>10000)
		{
		  System.out.println("GET 50% DISSCOUNT ON TOTAL BILL");
		  System.out.println("total bill:"+(x-(x/50)));
		}
		else if(x>8000 && x<=10000)
		{
			System.out.println("GET 40% DISSCOUNT ON TOTAL BILL");
			System.out.println("TOTAL BILL:"+(x-(x*40)/100));
		}
		else if(x>5000 && x<=8000 )
		{
			System.out.println("GET 30 DISSCOUNT ON TOTAL BILL");
			System.out.println("TOTAL BILL:"+(x-(x*30)/100));
		}
		else if(x>2000 && x<=5000)
		{
			System.out.println(   "GET 10 DISSCOUNT ON TOTAL BILL");
			System.out.println("TOTAL BILL:"+(x-(x*10)/100));
		}
		else
		{
			System.out.println("NO DISCCOUNT");
		}
	}
	public void m1() {
		System.out.println("HELLO");
		
	}
		public static void main(String[] args) 
		{
			System.out.println("MALL BILL");
			Scanner sc = new Scanner(System.in);
			Constructor1 xx = new Constructor1();
				xx.m1();
			 sc.close();
		}
		

}
