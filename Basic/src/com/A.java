package com;

public class A 
{
	int x; // global variable jvm will provide default value
	
	public A()
	{
		int i=10;			//local variable
		System.out.println(i);
		
	}
	public void m1()
	{
		String s="ABC";
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		double d=10.0;
		System.out.println("d");
		A a = new A();
		a.m1();
		System.out.println(a.x);
	}

}
