 package For_loop;

public class B_Star_Star_Sp {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
		{		
			for(int j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			for (int x = i; x < 5; x++) 
			{
	     		System.out.print("*");
			}
			System.out.println( );
		}
	}
}
