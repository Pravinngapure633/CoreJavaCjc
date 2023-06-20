package Equal_Operator;

public class A1 {
	
	public static void main(String[] args) {
		
			String s=new String("abc");
			String s1=new String("abc");
			
			System.out.println(s.equals(s1));	//true
			System.out.println(s==s1);		//false
			
			String x=new String("abc");
			String x1=new String("pqr");
			
			System.out.println(x.equals(x1));	//false
			System.out.println(x==x1);			//false
			
			String b=new String("abc");
			String b1=new String("pqr");
			
			b=b1;
			System.out.println(b==b1);			//true
			System.out.println(b.equals(b1));	//ture
			
	}

}
