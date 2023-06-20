package C_Overriding;

public class B1 extends A1 {

	@Override
	public void m1()
	{
		System.out.println("M1--B");
	}
	
	@Override
	public void m2(int j,String h)
	{
		System.out.println("M2--B");
	}
	
	@Override
	public String m3()
	{
		System.out.println("M3--B");
		return "PQR";
	}
	
	@Override
	public void m4(Object q)
	{
		System.out.println("M4--B");
	}
	
	@Override
	public Integer m5()
	{
		System.out.println("M5--B");
		return 20; 
	}
}
