package One_D_Array;

public class C_Copy_array_to_another_array {
	
	public static void main(String[] args) {
		
		//1st
		int []a= {11,20,56,47,32,30,43,50,60,65,79};
		//2nd
		int b[]=new int[a.length];
	
		for(int i=0; i<a.length ; i++)
		{
			b[i]=a[i];
		}
		for(int j=0; j<b.length; j++)
		{
			System.out.println("Array of B is:"+b[j]);
		}
	
	}

}
