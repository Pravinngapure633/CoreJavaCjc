package Jagged_Array;

public class Test {
	
	public static void main(String[] args) {
		
			//int [][]ar=new int [3][];
		
//		ar[0]=new int[] {10,2,30,40};
//		ar[1]=new int[] {30,60};
//		ar[2]=new int[]	{70,80,90};
		
			//or
			int [][]ar= {	{10,20,30,40} , {50,60}, {70,80,90} };
			
			for(int i=0; i<ar.length; i++)
			{
				for(int j=0; j<ar[i].length;j++)
				{
					System.out.println("Array Element:"+ar[i][j]);
				}
			}
			System.out.println("-----");
			System.out.println(ar[1][1]); //60 (index position of 1)S
	}

}
