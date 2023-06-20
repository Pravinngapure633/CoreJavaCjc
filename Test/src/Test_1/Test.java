package Test_1;

public class Test {
	public static void main(String[] args) {
		A ab = new B();
		A s = ab.m1(10);
		
		System.out.println(s.i);
		
		B b = new B();
		B s1 = b.m1(10);
		System.out.println(s1.j);
		
	}
}
