package Logical;

public class Contain_specific_value {
	
	public static boolean contains(int [] arr,int item)
	{
		for(int n : arr)
		{
			if(item==n)
			{
				return true;
			}			
		}
		return false;
	}
	public static void main(String[] args) {
		
		int[] array= {105,108,500,400,300,456,999};
		
		System.out.println(contains(array, 300));
		System.out.println(contains(array, 1000));
	}
	

}
