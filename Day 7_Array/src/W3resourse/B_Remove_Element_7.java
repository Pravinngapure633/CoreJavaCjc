package W3resourse;

import java.util.Scanner;

public class B_Remove_Element_7 {
	//NOT CORRECT
	public static void main(String[] args) {
		
			int []a= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
			
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!=56)
				{
					System.out.println(a[i]);
				}
			} 
			  
			
			//with Scanner
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter remove element");
			int x=sc.nextInt();
			
			int []b= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
			
			for(int i=0; i<a.length; i++)
			{
				if(b[i]!=x)
				{
					System.out.println(b[i]);
				}
			}
	sc.close();
	}
}
