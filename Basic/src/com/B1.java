package com;

import com.A1;

public class B1 extends A1{

	protected void m1()
	{
		System.out.println("M1--B");
	}
	
	public static void main(String[] args) {
		
		A1 a=new A1();
		a.m1();
		
		B1 b=new B1();
		b.m1();
		
		A1 a1=new B1();
		a1.m1();
	}
		
	

	
	
}
