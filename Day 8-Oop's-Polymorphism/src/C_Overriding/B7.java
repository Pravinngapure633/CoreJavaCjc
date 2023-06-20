package C_Overriding;

public class B7 extends A7 {

	int j;
	
	@Override
	public B7 m1(int j)
	{
		B7 b = new B7();
		b.j=200;
		return b;
	}
}
