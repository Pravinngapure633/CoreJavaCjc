package Logical;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int [] array1= { 999,777,222,444,333,666,111,555,888};
		
		String [] array2= {"java","pyth","c","d","X","A","b"};
		
				
		System.out.println("Orignal:"+Arrays.toString(array1));
		
		Arrays.sort(array1);
		
		System.out.println("Sort:"+Arrays.toString(array1));
		
		System.out.println("-----");
		
		System.out.println("Orignal:"+Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("sort:"+Arrays.toString(array2));
	}
}
