package Split_code;

public class B_Test1 {

		// get value in user defined method
	public void Display(A_Student_SG s) {
		System.out.println(s.getRollno());
		System.out.println(s.getName());

	}

	// set value in main method
	public static void main(String[] args) {

		B_Test1 t = new B_Test1();
		A_Student_SG s = new A_Student_SG();
		s.setRollno(101);
		s.setName("ABC");
		t.Display(s);
	}
}
