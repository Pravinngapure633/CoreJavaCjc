package C_Overriding;

public class Test_2 {
	public static void main(String[] args) {
		
			A2 a = new A2();
			a.m1();
			a.m2();
			
			System.out.println("--------");
			B2 b = new B2();
			b.m1();
			b.m2();
			System.out.println("--------");
			A2 a1 = new B2();
			a1.m1();
			a1.m2();
	}

}
