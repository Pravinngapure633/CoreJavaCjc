package G_Throw;

public class Test_2 {
	
	public void m1(int age)
	{
		System.out.println("M1--Start");
		if(age<=17)
		{
			throw new AgeInvalidException_2("Age is invalid");
			
		}
		System.out.println("yor are eligible");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main--st");
		
		Test_2 t=new Test_2();
		
		try
		{
			t.m1(15);
		}
		catch(AgeInvalidException_2 e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("MAin--end");
	}

}
