package Question_2;

public class A {

	public static void main(String[] args) {
		
		int []a=new int[3]; 
		
		a[1] =50;
		
		Object o=a;
		
		int []b=(int[])o;
		
		b[1]=100;
		
		System.out.println(a[1]);
		
		((int[])o)[1] = 500;
		 
        System.out.println(a[1]);
	}
}
