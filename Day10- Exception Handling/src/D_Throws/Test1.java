package D_Throws;

public class Test1 {
	
		//CHECKED EXCEPTION

	public void m1() throws ClassNotFoundException 
	{
		System.out.println("M1--Start");
		Class.forName("Test1");
		System.out.println("M1--End");
	}
	
	public static void main(String[] args)
	{
		
			System.out.println("MAin--Start");
			
			try
			{
				Test1 t=new Test1();
				t.m1();
			}
			
			catch(ClassNotFoundException e)
			{
				System.out.println("Catch -block");
				System.out.println("Catch-end");
			} 
			
	}
}
