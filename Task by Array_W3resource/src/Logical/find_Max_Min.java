package Logical;

public class find_Max_Min {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 55, 35, 40, 100 };
		int max;
		int min;

		max = arr[0];
		min = arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			if (arr[i] > max) 
			{
				max = arr[i];
			}
			else if (arr[i] < min) 
			{
				min = arr[i];
			}
		}
		System.out.println("Larg =" + max);
		System.out.println("small =" + min);
	}

}
