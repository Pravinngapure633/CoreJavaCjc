package G_Static_Keyword;

public class B_Test {

		public static void main(String[] args) {
			
				System.out.println(B_A.y); 		//class name ni pn call kru shakto only static variable
				
				System.out.println();
				
				B_A a = new B_A();
				System.out.println(a.y);
				a.y=400;
				System.out.println(a.y);
				a.m1();
				a.m2();
				
				System.out.println();
				
				B_A.m1();
				B_A.m2();
		}
}
