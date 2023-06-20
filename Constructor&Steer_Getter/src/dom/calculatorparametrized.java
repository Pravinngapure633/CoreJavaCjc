package dom;

import java.util.Scanner;

public class calculatorparametrized {
	
	public void Add(float a, int b, int c) 
	{
	    float result=a+b+c;
		System.out.println("ADDITION IS: "+a+"+"+b+"+"+c+"="+result);
		
	}
	public void Sub(float x, float y, int z) 
	{
		float result=x-y-z;
		System.out.println("SUBTRACTION IS:"+x+"-"+y+"-"+z+"="+result);
	    
	}
	
	public void Multi(float p, int q, double r) 
	{
		 double result=p*q*r;
		System.out.println("MULTIPLICATION IS: "+p+"*"+q+"*"+r+"="+result);
	}
	
	public void Divi(float n, int m ) 
	{
		float result=n/m;
		System.out.println("DIVISION IS: "+n+"/"+m+"="+result);
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		calculatorparametrized cc = new calculatorparametrized();
			
		
				System.out.println("Add-VALUE1:");
				float a=sc.nextFloat();
				System.out.println("VALUE2:");
				int b=sc.nextInt();
				System.out.println("VALUE3:");
				int c=sc.nextInt();
				cc.Add(a, b, c);
				
				System.out.println("Sub-VALUE1:");
				float x=sc.nextFloat();
				System.out.println("VALUE2:");
				float y=sc.nextFloat();
				System.out.println("VALUE3:");
				int z=sc.nextInt();
				cc.Sub(x, y, z);
				
				System.out.println("Multi-VALUE1:");
				float p=sc.nextFloat();
				System.out.println("VALUE2:");
				int q=sc.nextInt();
				System.out.println("VALUE3:");
				double r=sc.nextDouble();
				cc.Multi(p, q, r);
				
				System.out.println("DivVALUE1:");
				float n=sc.nextFloat();
				System.out.println("VALUE2:");
				int m=sc.nextInt();
				cc.Divi(n, m);
				sc.close();
				
	}
	
}
