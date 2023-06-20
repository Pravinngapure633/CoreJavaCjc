package F_Return_Type_In_Exception_Handling;

public class Test1 {

	@SuppressWarnings("finally")
	public int m1()
	{
		try
		{
			System.out.println("Try-Start");
			System.out.println(10/0);
			return 10;
		}
		catch(Exception e)
		{
			System.out.println("Catch-block");
			System.out.println("Exception:"+e);
			return 20;
			
		}
		finally
		{
			System.exit(10);
			System.out.println("finally-block");
			return 30;
		
		}
	}
	public static void main(String[] args) {
		
		Test1 t=new Test1();
		
		int i=t.m1();
		System.out.println(i);
				
	}
}
