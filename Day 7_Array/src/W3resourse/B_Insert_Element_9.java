package W3resourse;

import java.util.Arrays;

public class B_Insert_Element_9 {
	
	public static void main(String[] args) {
		
		int []a= {20,40,80,100,120,140};
		
		 // Insert an element in 3rd position of the array (index->2, value->5)
	// Insert element method:-
		int Indexposition =2;
		
		int newvalue=60;
	//formula	
		for(int i=a.length-1; i>Indexposition ;i--)
		{
			a[i]=a[i-1];
		}
		a[Indexposition]=newvalue;
		System.out.println("New Array :"+Arrays.toString(a));
	}

}
