package C_Finally_Block;

public class Test2 {
	
	public int m1()
	{
		int x=30;
	
		try
		{
			System.out.println("Try-block");
			return x;
		}
		finally
		{
			System.out.println("Finally-block");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main-Start");
		
		Test2 t=new Test2();
		int x=t.m1();
		System.out.println(x);
				
		
	}
	

}
