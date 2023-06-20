package G_Static_Keyword;

public class A_Test {
		
		//instance variable
		int i=100;
		
		//Static variable
		static int j=200;				//j chi memory ekch rahnar fakt bs value change hotil jew apn value change kru tewa
		
		
		public static void main(String[] args) {
			
			System.out.println(j);	//// without object create krun pn j print kru shakto but static variable pahije
			
			System.out.println();
				A_Test t = new A_Test();
				
				System.out.println(t.i);
				System.out.println(j);		
				System.out.println(t.j);
				System.out.println(A_Test.j);	//class name.variable name ni pn call karu shakto only for static variable
				
				System.out.println();
				
				A_Test t1 = new A_Test();	//t1 chi new memory banli
					t1.j=300;				
				System.out.println(j);		
				System.out.println(t.j);
				System.out.println(t1.j);
				System.out.println(A_Test.j);
				System.out.println(t1.i);		// i chi dusari memory create honar t1=---
	
				System.out.println();
				
				t1.i=400;
				System.out.println(t1.i);	//t1 chi memory chi value
				System.out.println(t.i);	//t chi memory chi value
				
				System.out.println();
				
				t.i=500;
				System.out.println(t.i);
				
				
		
		}
}
