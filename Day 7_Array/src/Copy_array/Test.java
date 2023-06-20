package Copy_array;

public class Test {
	
	public static void main(String[] args) {
		
		int []ar1= {10,20,30,40};
		
		for(int i=0; i<ar1.length;i++)
		{
			System.out.println(ar1[i]);
		}
		System.out.println("-----");
		//clone
		int []ar2=ar1.clone();
		for(int i=0; i<ar2.length;i++)
		{
			System.out.println(ar2[i]);
		}
		
		System.out.println("------");
		//or
		int []ar3=new int[3];
		System.arraycopy(ar1, 0, ar3, 0, 3);
		
		for(int i=0;i<ar3.length;i++)
		{
			System.out.println(ar3[i]);
		}
		
		
	}

}
