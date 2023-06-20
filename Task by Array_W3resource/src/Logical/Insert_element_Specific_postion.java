package Logical;

import java.util.Arrays;

public class Insert_element_Specific_postion {
	
	
//	public static void main(String[] args) {
//		
//		int[] arr= {10,20,40,50,60,70};
//		System.out.println(Arrays.toString(arr));
//		
//		int indexposition=2;
//		
//		for(int i=arr.length-1; i>indexposition; i--)
//		{
//			arr[i]= arr[i-1];
//		}
//		int addnewvalue=30;
//		arr[indexposition] = addnewvalue;
//		System.out.println(Arrays.toString(arr));
//
//}
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50,60};
		System.out.println(Arrays.toString(a));
		//int i;
		int x=a.length;
		
		int ad=500;
		int pos=2;
		
		a = insert(x,a,ad,pos);
		System.out.println(Arrays.toString(a));
	}
		
		public static int[] insert(int x,int arr[],int ad,int pos)
		{
			int i;
			int[] newarr=new int[x+1];
			
			for(i=0;i<x+1;i++)
			{
				if(i<pos-1)
				{
					newarr[i]=arr[i];
				}
				else if(i==pos-1)
				{
					newarr[i]=ad;
				}
				else
				{
					newarr[i]=arr[i-1];
				}
			}
			
			
			return newarr;
			
		}
		
		
	
}
