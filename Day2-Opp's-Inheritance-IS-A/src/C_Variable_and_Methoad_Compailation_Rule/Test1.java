package C_Variable_and_Methoad_Compailation_Rule;

public class Test1 {
		public static void main(String[] args)
		{
			A1 a = new A1();
			System.out.println(a.a);
			System.out.println(a.b);
			a.m1();
			a.m2();
			System.out.println();
			
			B1 b=new B1();
			System.out.println(b.a);
			System.out.println(b.c);
			b.m1();
			b.m3();
			System.out.println(b.b);
			b.m2();
			System.out.println();
			
			C1 c=new C1();
			System.out.println(c.c);
			System.out.println(c.d);
			c.m3();
			c.m4();
			System.out.println(c.a);
			c.m1();
			System.out.println(c.b);
			c.m2();
			System.out.println();
			
			
			A1 a1 =new B1();
			System.out.println(a1.a);
			System.out.println(a1.b);
			a1.m1();
			a1.m2();
			System.out.println();
			
			
			A1 a2=new C1();
			System.out.println(a2.a);
			System.out.println(a2.b);
			a2.m1();
			a2.m2();
			System.out.println();
			
			
			B1 b1=new C1();
			System.out.println(b1.a);
			System.out.println(b1.c);
			b1.m1();
			b1.m3();
			System.out.println(b1.b);
			b1.m2();
			
			
					
			
			
			
			
		}
}
