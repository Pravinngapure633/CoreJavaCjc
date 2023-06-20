package C_Overriding;

public class B6 extends A6{

	@Override
	protected void m1(int i)
	{
		System.out.println("m1--B");
	}

	@Override
	public void m2()
	{
		System.out.println("M2--B");
	}
}
