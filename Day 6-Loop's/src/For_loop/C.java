package For_loop;

public class C {
		
	public static void main(String[] args) 
	{
		
		for(int i=0; i<4; i++)
		{
			for(int j=i; j<4; j++)
			{
				System.out.print(" ");
			}
				
			for(int x=i; x<=i; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
