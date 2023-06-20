package B_Multi_level;



public class A_B_Test extends B {
	
	public void m3() {
		System.out.println("M3 method");
		System.out.println(x);
		m1();
		System.out.println(y);
		m2();
		
	}
	
	public static void main(String[] args) {
		
		A_B_Test t=new A_B_Test();
		t.m3();
	}

}
