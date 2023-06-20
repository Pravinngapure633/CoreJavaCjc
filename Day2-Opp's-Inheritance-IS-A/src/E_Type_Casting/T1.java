package E_Type_Casting;

public class T1 {
	
	public static void main(String[] args) {
		
			A1 a=new A1();
			
			int x=a.m1();
			//int y=a.m2();			object to int kra sathi type casting must be imp
			int y=(int)a.m2();
			
			System.out.println(x);
			System.out.println(y);
	}

}
