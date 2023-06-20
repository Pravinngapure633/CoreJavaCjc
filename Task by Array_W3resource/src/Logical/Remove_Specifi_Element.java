package Logical;

import java.util.Scanner;

public class Remove_Specifi_Element {
	
	
	
//	public static void main(String[] args) {
//		int[] array= {105,108,500,400,300,456,999};
//		
//		System.out.println("Orignal"+Arrays.toString(array));
//		
//		int removeindex=1;
//		
//		for(int i=removeindex; i<array.length-1; i++)
//		{
//			array[i]=array[i+1];
//		}
//		
//		System.out.println("Remove"+Arrays.toString(array));
//	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index");
		int removeIndex=sc.nextInt();
		
		int[] a= {10,20,30,40,50,60,70,80};
		int[] b=new int[a.length-1];
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Total Element of A:"+a.length);
		
		for(int i=0;i<a.length-1;i++)
		{
			if(i<removeIndex)
			{
				b[i]=a[i];
			}
			else if (i>=removeIndex)
			{
				b[i]=a[i+1];
			}
		}
		System.out.println("======After remove=====");
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("Total element B:"+b.length);
	}
}                                                                                                       
