package Logical;

public class Find_Duplicate_Integer {

	public static void main(String[] args) {

		int[] arr = { 10, 15, 25, 10, 25, 30, 55 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && (i != j)) {
					System.out.println("Duplicate :" + arr[j]);
				}
			}
		}
	}

}
