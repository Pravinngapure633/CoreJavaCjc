package Returntype;

public class C_Rseult1 {

	public static void main(String[] args) {
		
			C_Calculator1 c=new C_Calculator1();
			
			int c1=c.Add();
			System.out.println("ADD IS:"+c1);
			// OR System.out.println(c.Add());
			
			int c2=c.Sub();
			System.out.println("SUB IS:"+c2);
			
			System.out.println("MULTI IS:"+c.Multi());
			
			System.out.println("DIVI IS:"+c.Divi());
			
	}
}
