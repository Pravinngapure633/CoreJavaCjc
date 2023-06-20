package D_Throws;

public class Test {
	
	
	//UNCHECKED EXCEPTION
	
	public void m1()
	{
		System.out.println("M1--A");
		int x=10/0;
		System.out.println("M1--A--End");
	}
	
	public static void main(String[] args) {
		
			System.out.println("Main--Start");
			
		try
		{
			Test t=new Test();
			t.m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch--block");
		}
	}

}
