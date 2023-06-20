package B_One_Try_Multilr_Catch_Block;

public class Test2 {
	
	public static void main(String[] args) 
	{
		
			try 
			{
				String s = args[0];
				int x= Integer.parseInt(s);
				int a=10/x;
				System.out.println("cnnja");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Enter input value :");
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter number :");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Enter non zero value :");
			}
	}

}
