package G_Static_Keyword;

public class A_Test1 {
	
		int x=100;
		static int y=200;		//static chi ekch memory bante
		
		public static void main(String[] args) {
			
				A_Test1 t = new A_Test1();
				System.out.println(t.x);
				System.out.println(t.y);
				System.out.println(y);
				
				System.out.println();
				
				t.x=300;
				t.y=400;		// upgrade y value
				
				A_Test1 t1 = new A_Test1();
				System.out.println(t1.x);
				System.out.println(t1.y); // upgraded value of y
				
				System.out.println();
				
				t1.y=500;				//upgrade y
				System.out.println(t.x);
				System.out.println(A_Test1.y);
				System.out.println(t.y);
				System.out.println(t1.x);
				System.out.println(t1.y);
				
				
				System.out.println();
				
				A_Test1 t2 = new A_Test1();
				t2.x=2000;
				t2.y=900;					//upgrade y
				System.out.println(t.x);
				System.out.println(t1.x);
				System.out.println(t2.x);
				System.out.println(t.y);
				System.out.println(t1.y);
				System.out.println(t2.y);
		}

}
