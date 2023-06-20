package while_Loop;

public class D_Factorial {
	public static void main(String[] args) {
			double num=5;
			double fact=1;
			
			int i=1;
			while(i<=num)
			{
				fact=fact*i;
			//	System.out.println(fact+"*"+i+"="+fact);
				i++;
			}
			System.out.println("Factorial of "+num+" is "+fact);
	}

}
