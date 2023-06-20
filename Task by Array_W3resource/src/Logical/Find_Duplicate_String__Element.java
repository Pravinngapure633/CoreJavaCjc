package Logical;

public class Find_Duplicate_String__Element {

	public static void main(String[] args) {
		
		String[] arr={"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]) && (i!=j))
				{
					System.out.println("Duplicate :"+arr[j]);
				}
			}
		}
	}
}
