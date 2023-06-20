package C_Overriding;

public class A1 {

		
			public void m1()
			{
				System.out.println("m1-A");
			}
			
			public void m2(int i, String s)
			{
				System.out.println("m2-A");
			}
			
			public String m3()
			{
				System.out.println("m3-A");
				return "abc or null";
			}
			
			public void m4(Object o)
			{
				System.out.println("m4-A");
			}
			
			public Object m5()
			{
				System.out.println("m5-A");
				return 10;
			}
}
