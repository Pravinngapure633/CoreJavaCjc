package B_Narrowing_Concept;

public class A1 {
	
		public void m1(Object o)
		{
			System.out.println("M1--object--parameters");
		}
		
		public void m1(String s)
		{
			System.out.println("M1--String--parameters");
		}
		public void m1(A1 o)
		{
			System.out.println("M1--A--parameters");
		}

}
