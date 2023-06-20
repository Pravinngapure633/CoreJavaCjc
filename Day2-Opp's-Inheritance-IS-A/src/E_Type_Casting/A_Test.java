package E_Type_Casting;
			// parent child relation always compulsory.
			//Object is parent (higher) -- primitive and non data types is child(Lower)

public class A_Test {
	
		public Object m1()
		{
			return "ABC";
		}
		
		public Object m2()
		{
			return 10;
		}
		
		public static void main(String[] args) {
				A_Test t = new A_Test();
						
				String s=(String)t.m1();
				
				System.out.println(s);
				
				int i=(int)t.m2();
				System.out.println(i);
		}

}
