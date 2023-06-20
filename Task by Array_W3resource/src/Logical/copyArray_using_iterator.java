package Logical;

import java.util.Arrays;

public class copyArray_using_iterator {
	
	public static void main(String[] args) {
		
		int[] array= {10,20,50,60,44,80};
		
		int[] newarray= array;
		
		
		for(int i=0 ; i<array.length;i++ )
		{
			newarray[i] = array[i];
		}
		System.out.println(Arrays.toString(newarray));
	}

}
