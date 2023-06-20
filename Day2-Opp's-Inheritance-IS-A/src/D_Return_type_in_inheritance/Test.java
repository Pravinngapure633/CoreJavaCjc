package D_Return_type_in_inheritance;

public class Test {
		
	
		//A parent ahe tr apn 3gh 
		public A m1()
		{
			
			A a=new A();
			B b=new B();
			C c = new C();
			System.out.println("m1--A");
			
			return a;
		}
		
		public B m2()
		{
			B b = new B();
			C c=new C();
			System.out.println("m2---B");
			
			return b;
			
		}
		
		public C m3()
		{
			C c=new C();
			System.out.println("M3--C");
			return c;
			
		}
		
		public static void main(String[] args) {
			
			Test t=new Test();
			t.m1();
			t.m2();
			t.m3();
			
		}
		
	}

