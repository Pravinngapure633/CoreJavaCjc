package W3resourse;

import java.util.Scanner;

public class B_Find_Index_No6 {
	
	public static void main(String[] args) {
		
		int []a= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==56)
			{
				System.out.println(i);
			}
			
		}
		
		//with scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		int b=sc.nextInt();
		
		int  []c= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		for(int i=0; i<a.length; i++)
			{
				if(c[i]==b)
				{
					System.out.println("Index No is :"+i);
				}
				
			}
		sc.close();
		
	}

}
