package C_Overriding;

public class Test_3 {
		
		public static void main(String[] args) {
			
				A3 a = new A3();
				a.m1();
				
				System.out.println("-------");
				
				B3 b = new B3();
				b.m1();
				
				System.out.println("--------");
				
				A3 a1 = new B3();
				a1.m1();
		}

}
