package Split_code;

public class C_Test2 {

	public A_Student_SG Display(A_Student_SG s) {
		A_Student_SG s1 = s;
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		return s1;
	}

	public static void main(String[] args) {

		C_Test2 t = new C_Test2();
		A_Student_SG s = new A_Student_SG();
		s.setRollno(101);
		s.setName("ABC");

		A_Student_SG s2 = t.Display(s);
		// s2.setName("por");
		// s2.setRollno(10);
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());
	}

}
