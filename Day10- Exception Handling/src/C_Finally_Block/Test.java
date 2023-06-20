package C_Finally_Block;

public class Test {
	
	public static void main(String[] args) {
		
			System.out.println("Main-Start");
	
			try
			{
				System.out.println("Try-Start");
				int x=10/0;				//int x=10/2;
				System.out.println("Try-End");
			}
			finally
			{
				System.out.println("Finally-block");
			}
			
			System.out.println("Main-end");
	}

}
