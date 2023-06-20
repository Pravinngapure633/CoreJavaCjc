package Loops_Star;

public class F_Star {
	public static void main(String[] args) {
		
		 for(int i=1; i<=5; i++)
		 {
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print("*");
			 }
			 for(int k=4; k>=i; k--)
			 {
				 System.out.print(" ");
			 }
			 for(int x=4; x>=i; x--)
			 {
				 System.out.print(" ");
			 }
			  
			 for(int y=1; y<=i; y++)
			 {
				 System.out.print("*");
			 }  
			
			 System.out.println();
		 }
		 for(int i=1; i<=4; i++)
		 {
			 for(int j=4; j>=i; j--)
			 {
				 System.out.print("*");
			 }
			 for(int k=2; k<=i; k++)
			 {
				 System.out.print(" ");
			 }
			 for(int x=0; x<=i; x++)
			 {
				 System.out.print(" ");
			 }
			 for(int y=4; y>=i; y--)
			 {
				 System.out.print("*");
			 }
			 
			 
			 System.out.println();
		 }
	}
}
