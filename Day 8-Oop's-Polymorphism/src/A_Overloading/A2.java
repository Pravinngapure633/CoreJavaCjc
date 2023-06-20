package A_Overloading;

	
public class A2 {
	
		public void m1() {
			
			System.out.println("M1--default--parametres");
		}
		
		public void m1(int i,int j) {
			
			System.out.println("M1--int 2--parameters");
		}
		
		public void m1(int i)
		{
			System.out.println("M1--int i--parameters");
		}
		
		public void m1(String s) {
			
			System.out.println("M1--String--parameters");
		}

}
