  package For_loop;

public class B_Task_Star_sp1 {

	public static void main(String[] args) {

   		for (int i = 0; i < 5; i++)
		{
			for (int j = i; j < 5; j++) 
			{
				System.out.print(" ");
			}
			 for(int x=0;x<=i;x++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
