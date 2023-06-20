package E_Type_Casting;

public class Test2 {
	
		public static void main(String[] args) {
			
				A2 a=new A2();
				
				String s=a.m1();
				//String s1=a.m2();
				String s1=(String)a.m2();
				System.out.println(s);
				System.out.println(s1);
		}

}
