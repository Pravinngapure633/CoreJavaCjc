package C_Variable_and_Methoad_Compailation_Rule;

public class Test {
	/*variable and method compilation rule: Variables and methoad starts from reference
	 class.If it is present then it will get compile . If is is not present then it check 
	from their PARENT class and then compile. If it is not present then it will give compile time error.*/
	
	/* VARIABLE RUNNING RULE: Variable running start from reference class. If it is present
	 * it will get executed. It will be not present in reference class it will executed from 
	 * their parent class.*/ 
	 
	
	/*METHOAD RUNNING RULE: It is start from CONSTRUCTOR CLASS. If it is present then it will 
	 * get executed.It is not present then it will get executed from their parent class.*/ 
	 
	
		public static void main(String[] args) {
			
				A a = new A();
				System.out.println(a.a);
				System.out.println(a.b);
				a.m1();
				a.m2();
				
				
				B b = new B();
				System.out.println(b.a);
				System.out.println(b.c);
				b.m1();
				b.m3();
				System.out.println(b.b);
				b.m2();
				
				
				A a1 = new B();
				System.out.println(a1.a);
				System.out.println(a1.b);
				a1.m1();
				a1.m2();
		}

}
