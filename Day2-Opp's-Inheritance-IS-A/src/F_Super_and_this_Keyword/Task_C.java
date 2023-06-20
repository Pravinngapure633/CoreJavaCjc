package F_Super_and_this_Keyword;

public class Task_C extends Task_B{

	
	public Task_C()
	{
		super(10.10f);  //must be important 
		System.out.println("Const--Task-C");
		this.m6();
	}
	
	public void m6() {
		System.out.println("M6--Task-C");
	}
}
