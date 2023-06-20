package C_Overriding;

public class Test_4 {
	
	public static void main(String[] args) {
		
		A4 a = new A4();	
		 a.m2(10);
		 
  		 System.out.println("-------");
		 
		B4 b = new B4();
		b.m2(20);
		
		System.out.println("-------");
		
		A4 a1 = new B4();
		a1.m2(10);
	}

}  
