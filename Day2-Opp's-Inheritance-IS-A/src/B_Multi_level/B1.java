package B_Multi_level;

public class B1 extends A1 {
		
			int b=20;
		
		public void m2()
		{
			m1();
			System.out.println(a);
			System.out.println(b);
			//m2(); -----Stack over flow error
			
		}

}
