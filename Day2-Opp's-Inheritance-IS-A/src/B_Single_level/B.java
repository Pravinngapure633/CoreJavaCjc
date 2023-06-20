package B_Single_level;

public class B extends A {

	// SINGLE-LEVEL
	// parent=A
	// child=B

	public void display() {
		System.out.println(i);
		System.out.println(s);
		m1();

	}

	public static void main(String[] args) {
		B b = new B();
		b.display();
	}
}
