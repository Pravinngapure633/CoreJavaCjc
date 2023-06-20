package C_Overriding;

public class B3 extends A3{

		@Override
		public void m1()
		{
			
			m2(20);
			System.out.println("M1--B");
		}
		public void m2(int i)
		{
			System.out.println("M2--B");
		}
}
