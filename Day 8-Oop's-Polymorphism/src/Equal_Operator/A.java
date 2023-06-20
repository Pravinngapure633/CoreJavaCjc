package Equal_Operator;

public class A {

		public static void main(String[] args) {
			
				A a = new A();
				
				System.out.println(a);	//A@15d
				
				A a1 = new A();
				System.out.println(a1);	//A@6d06
				
				System.out.println(a==a1);//false
				System.out.println(a.equals(a1));//false
				
				a=a1;
				System.out.println(a);	//A@6d06
				System.out.println(a.equals(a1));//true
		}
}
