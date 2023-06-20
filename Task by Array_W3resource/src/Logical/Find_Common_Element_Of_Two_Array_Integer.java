package Logical;

public class Find_Common_Element_Of_Two_Array_Integer {

	
	public static void main(String[] args) {
		
		int[] arr1= {100,500,400,300,800,900};
		int[] arr2= {900,777,888,500,400,999,333};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
