package F_Super_and_this_Keyword;

public class B2 extends A2 {

	public B2(double d)
	{
		super(10,"AB");
		super.m1();
		super.m2(10.10f);
		//System.out.println("Const--B2");
		
	}
	
	public void m3(String s,String c) 
	{
		super.m1();
		System.out.println("M3-String-String-B2");
	}
	
}
