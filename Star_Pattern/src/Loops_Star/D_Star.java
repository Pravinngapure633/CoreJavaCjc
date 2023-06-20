package Loops_Star;

public class D_Star {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int x=2; x<=i; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		 
}

}
