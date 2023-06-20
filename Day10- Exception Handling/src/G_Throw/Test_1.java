package G_Throw;

public class Test_1 {

	public void m1(int age) throws AgeInvalidException
	{
		System.out.println("M1--Start");
		
		if(age<=18)
		{
			AgeInvalidException a=new AgeInvalidException("Age invalid");
			throw a;
		}
		System.out.println("You are eligible");
	}
	
	public static void main(String[] args) throws AgeInvalidException {
		
		System.out.println("MAin--Start");
		
		Test_1 t=new Test_1();
		t.m1(17);
		
		System.out.println("MAin--End");
		
	}
}
