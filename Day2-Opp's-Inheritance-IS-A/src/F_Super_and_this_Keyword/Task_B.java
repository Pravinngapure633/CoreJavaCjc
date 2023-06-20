package F_Super_and_this_Keyword;

public class Task_B extends Task_A {

	public Task_B(float f)
	{
		this.m4();
		System.out.println("Const--Task-B");
	}
	
	public void m4() 
	{
		this.m5();
		System.out.println("M4--Task-B");
	}
	
	public void m5() 
	{
	
		System.out.println("M5--Task-B");
	}
}
