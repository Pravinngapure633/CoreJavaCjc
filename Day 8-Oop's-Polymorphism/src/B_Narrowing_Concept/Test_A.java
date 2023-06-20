package B_Narrowing_Concept;

public class Test_A {

		public static void main(String[] args) {
			
			A a = new A();
			a.m1(null);
			//a.m1(null);
			a.m1((Object)null);
}
}
