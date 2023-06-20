package W3resourse;


import java.util.Arrays;

public class A_Sort {

	public static void main(String[] args) {
		
		int []a= {10,9,8,7,8,6,5,4,2,1,3};
		
		String []b= {"P","R","A","V","I","N"};
		
		Arrays.toString(a);
		System.out.println("Orignal int array :"+Arrays.toString(a));
			
		Arrays.sort(a);				//imp sort
		
		System.out.println("Sort int array:"+Arrays.toString(a));
		
		Arrays.toString(b);
		System.out.println("Orignal String array"+Arrays.toString(b));
		
		Arrays.sort(b);
		System.out.println("sort String array:"+Arrays.toString(b));
		
		
	}
}
