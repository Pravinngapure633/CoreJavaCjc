package Return_Type_Array;

public class Test {

		
		public static int[] m1()
		{
			return new int[] {10,20,30,40};
			
		}
		
		public static void main(String[] args) {
			
			int[]ar=m1();
			
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]);
			}
		}
}

