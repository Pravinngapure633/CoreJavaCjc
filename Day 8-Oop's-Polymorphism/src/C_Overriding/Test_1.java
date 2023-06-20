package C_Overriding;

public class Test_1 {
	
	public static void main(String[] args) {
		
			B1 b=new B1();
			b.m1();
			b.m2(10, null);
			b.m3();
			b.m4(10);
			b.m5();
			System.out.println("-----------");
			A1 a=new B1();
			a.m1();
			a.m2(20, null);
			a.m3();
			a.m4(20);
			a.m5();
			System.out.println("--------");
			
			A1 aa=new A1();
			aa.m1();
			aa.m2(20, null);
			aa.m3();
			aa.m4(20);
			aa.m5();
			
	}

}
