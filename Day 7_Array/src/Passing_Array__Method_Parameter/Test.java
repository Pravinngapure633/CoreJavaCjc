package Passing_Array__Method_Parameter;

public class Test {

		public void m1(int ar [])
		{
			for(int i=0; i<ar.length; i++)
			{
				System.out.println(ar[i]);
			}
			System.out.println("M1--Test");
		}
		
		public static void main(String[] args) {
			
//			int []a= {10,20,30,40};
//			
			Test t=new Test();
//			t.m1(a);
			
			t.m1(new int[] {10,20,30,40});		//anonymous array
			
		}
}
