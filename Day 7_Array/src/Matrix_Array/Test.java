package Matrix_Array;

public class Test {

	public static void main(String[] args) {
		
			 int [][] ar=new int [3][3];
			 
			 //Two dimensional array in single line declaration
			 //int [][]ar ={ {10,20,30}, {40,50,60}, {70,80,90} };
			 //or
			 ar[0]=new int[] {10,20,30};
			 ar[1]=new int[] {20,30,40};
			 ar[2]=new int[] {50,60,70};
	
			 for(int i=0; i<ar.length; i++)
			 {
				 for (int j=0; j<ar[i].length; j++)
				 	{
					 	System.out.println(ar[i][j]);
				 	}
			 }
			 System.out.println("------");
			 System.out.println(ar[0][0]);
	}
	
}
