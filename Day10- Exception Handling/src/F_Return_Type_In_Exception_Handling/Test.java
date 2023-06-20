package F_Return_Type_In_Exception_Handling;

public class Test {
	
	@SuppressWarnings("finally")
	public int m1()
	{
		try
		{
			System.out.println("Try-Start");
			System.out.println(10/0);
			return 10;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch-block");
			System.out.println("Exception :"+e);
			return 20;
		}
		finally
		{
			System.out.println("Finally-block");
			return 30;
		}
	}
		public static void main(String[] args) {
			
			Test t=new Test();
			int i=t.m1();
			System.out.println(i);
		}

}
