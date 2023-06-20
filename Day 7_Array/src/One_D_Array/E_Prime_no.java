package One_D_Array;

public class E_Prime_no {

	public static void main(String[] args) {
		
		int []a= {11,20,25,56,57,47,32,30,43,50,61,70,79};
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=1; j<=a[i]; j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("No is Prime :"+a[i]);
				
			}
			else
			{
				System.out.println("No is not prime :"+a[i]);
			}
			count=0;
		}
	}
}
