package W3resourse;

import java.util.Arrays;

public class B_Remove_Element_new {
	
		// element remove kela tr array size same pahije mhnun last elament double print hoto 

	public static void main(String[] args) {

		int[] a = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		
		System.out.println("Old Array :"+Arrays.toString(a ));

		// main formula
		int remove = 8;
		for (int i = remove; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		System.out.println("New array :" + Arrays.toString(a));
	}

}
