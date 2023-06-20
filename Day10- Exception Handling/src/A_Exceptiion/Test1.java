package A_Exceptiion;

public class Test1 {
	
	public static void main(String[] args) {
		
		System.out.println("Main--Start");
		
		try
		{
			System.out.println("Try--Start");
			
			int y=10/0;							//error asel tr to try end print nhi krnar direct catch madhe janar
			
			System.out.println("Try--End");
		}
		catch (ArithmeticException e) {
			System.out.println("catch--block");
		}
		System.out.println("MAin--end");
}

}
