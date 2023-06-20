package while_Loop;

public class B_Prime_no {
				
		public static void main(String[] args) {
			
				int num=5;
				int count=0;
				
			//while loop
				int i=1;
			while(i<=5)
			{
				if(num%i==0)
				{
					count++;
					
				}
				i++;
			}
			if(count==2)
			{
				System.out.println("No is prime :"+num);
			}
			else
			{
				System.out.println("no is not prime"+num);
			}
			
		}

}
