package One_D_Array;

public class A_Basic1 {
	
	public static void main(String[] args) {
		
			int a[] = {10,20,30,40,50}; //Declaration+initialization
			
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a);
			System.out.println();
			//for loop
			for(int i=0; i<=4; i++) //index position always start in 0 in array 
			{
				System.out.println(a[i]);
			}
			System.out.println();
			
			//while loop
			int i=0;
			while(i<=4)
			{
				System.out.println(a[i]);
				i++;
			}
	}
}
