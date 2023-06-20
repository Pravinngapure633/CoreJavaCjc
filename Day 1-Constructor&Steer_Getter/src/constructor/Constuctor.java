package constructor;

import java.util.Scanner;

public class Constuctor 
{
			int x;
			Scanner sc = new Scanner(System.in);

	public Constuctor() 
	{
		System.out.println("ENTER AMOUNT");
		int x=sc.nextInt();
		if(x<2000)
		{
			System.out.println("hiiii");
		}
		else
		{
			System.out.println("bye");
		}
	}

	public void m1(int a, int b)
	{
		int result=a+b;
		System.out.println("result"+a+"+"+b+"="+result);
	}
	
	
	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			Constuctor cc=new Constuctor();
			System.out.println("enter vale 1&2");
				cc.m1(sc.nextInt(), sc.nextInt());
				sc.close();
	}
}