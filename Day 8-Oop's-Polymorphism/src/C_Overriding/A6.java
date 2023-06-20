package C_Overriding;

public class A6 {
	//public>protected>default>private
	void m1(int i)		//defalut //lower to high
	{
		System.out.println("m1--A");
	}
	
	protected void m2()
	{
		System.out.println("M2--A");
	}
}
