package C_Finally_Block;

public class Test1 {
	
	public static void main(String[] args) {
		
		System.out.println("Main-start");
	
		
		try
		{
			System.out.println("Try-Start");
			int x=10/2;				//int x=10/0;
			System.out.println("Try-end");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Catch-block");
		}
		finally
		{
			System.out.println("Finally-block");
		}
		
		System.out.println("Main-end");
	}

}
