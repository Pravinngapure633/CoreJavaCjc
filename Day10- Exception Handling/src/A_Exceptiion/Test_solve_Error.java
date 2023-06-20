package A_Exceptiion;

public class Test_solve_Error {
	
	public static void main(String[] args) {
		
			System.out.println("Main--Start");
			
			try
			{
				int y=10/0;
			}
			catch (ArithmeticException e) {
				System.out.println("catch--block");
			}
			System.out.println("MAin--end");
	}

}
