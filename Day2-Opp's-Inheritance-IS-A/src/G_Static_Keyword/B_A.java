package G_Static_Keyword;

public class B_A {
		
		int x=100;
		static int y=200;
		
		public static void m1()
		{
			System.out.println("M1--Static--A");
			System.out.println(y);
//			int y;
//			System.out.println(y);			//local variable may not be initialized
		}
		static public void m2()
		{
			System.out.println("M2--Static--A");
		}
}
