package W3resourse;

import java.util.Arrays;

public class B_Copy_Array_8 {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,11,50,54,60,40};
		System.out.println("old array :"+Arrays.toString(a));
		
		//Copy methoad 
		int aary[]=new  int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			aary[i]=a[i];
			
		}
		System.out.println("New Array"+Arrays.toString(aary));
	}

}
