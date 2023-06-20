package G_Throw;

public class Test {
	
	public void m1(int age) throws AgeInvalidException 
	{
		System.out.println("M1--START");
		
		
		if(age<0) {
				throw new AgeInvalidException("Age Invalid");
				
	
		}
		System.out.println("M1_END");
	}
	
	public static void main(String[] args) {
		
		System.out.println("MAIN--START");
		
		Test t=new Test();
		
		try
		{
			t.m1(-10);
		}
		catch(AgeInvalidException e)
		{
			System.out.println("CATCH BLOCK:    "+e.getMessage());
		}
		System.out.println("MAIN--END");
	}

}
