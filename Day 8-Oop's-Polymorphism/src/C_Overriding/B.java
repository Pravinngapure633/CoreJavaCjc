package C_Overriding;

public class B extends A {

		@Override
		B m1()
		{
			return new B();
			
		}
		
		@Override
		public int m2()
		{
			return 20;
		}
}
