package W3resourse;

public class A_Average_4 {
	public static void main(String[] args) {
		
	int []a= {20,30,25,35,-16,60,-100};
	
	int sum=0;
	
	for(int i=0;i<a.length; i++)
	{
		sum+=a[i];	
		
	}
	double average=sum/a.length;
	System.out.println(average);
	}
}
