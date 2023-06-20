package I_Constant_Keyword;

public class A2 {

		int x;
		
		public static void main(String[] args) {
			
				final A2 a=new A2();
				a.x=100;
				
				A2 a1=new A2();
				a1.x=200;
				
				//a=a1;
				System.out.println(a.x);
				
		}
}
