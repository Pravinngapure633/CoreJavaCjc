package F_Super_and_this_Keyword;

public class Task_A {
	
	public Task_A()
	{
		this.m2(10);  
		this.m1();
		this.m3(1, "AB");
		System.out.println("Const-Task-A");
	}
	
	public void m1() 
	{
		
		System.out.println("M1--TAsk-A");
	}
	
	public void m2(int i)
	{
		System.out.println("M2--Task-A");
	}
	
	public void m3(int i,String s) 
	{
		System.out.println("M3--Task-A");
	}
}
