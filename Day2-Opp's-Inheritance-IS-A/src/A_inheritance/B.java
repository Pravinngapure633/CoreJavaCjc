package A_inheritance;

public class B extends A
{
	int y;
	
	public void m2() {
			
	}
	
	public void m4() {
		
		A a = new A();
		a.m1();
		m2();
		System.out.println(a.x);
		System.out.println(y);
		
		
	}
}
