package Loops_Star;

public class A_Star1 {

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
				System.out.println();
			}
	}
}
