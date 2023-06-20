package Que_5;

public class A {
	
	 public static void main(String[] args)
	    {
	         int[][] a = {{1,2,}, {3,4}};
	 
	         int[] b = (int[]) a[1];
	 
	         System.out.println(a[1][1]);
	         Object o1 = a;
	 
	         int[][] a2 = (int[][]) o1;
	 
	         int[] b2 = (int[]) o1;
	 
	         System.out.println(b[1]);
	    }

}
