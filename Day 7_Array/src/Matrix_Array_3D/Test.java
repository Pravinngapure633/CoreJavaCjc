package Matrix_Array_3D;

public class Test {

	public static void main(String[] args) {
		
		int [][][] ar=  { {	{10,20}, {30,40}, {50,60} } };
		
		for( int i=0; i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int j2=0;j2<ar[i][j].length;j2++)
				{
					System.out.println(ar[i][j][j2]);
				}
			}
		}
	}
}
