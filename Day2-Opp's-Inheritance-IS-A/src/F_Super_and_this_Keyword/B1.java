package F_Super_and_this_Keyword;

public class B1 extends A1{
		
		public B1()
		{
			//super();-- by default present
			System.out.println("Const--B1");
		}
		public B1(String s)
		{
			//super();---by default rahte but non-parameterized
			super(10);// parameterized constructor rahila t nehmi super(value) kara lagte
			System.out.println("Const-String-B1");
		}
}
