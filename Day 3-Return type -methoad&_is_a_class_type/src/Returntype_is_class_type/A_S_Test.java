package Returntype_is_class_type;

public class A_S_Test {

	public static void main(String[] args) {
		
		 A_Student s1 = new A_Student();
		 	int i=s1.m1();
		 	A_Student stu=s1.m2();
		 	
		 	System.out.println(stu.rollno);
		 	System.out.println(i);
		 	
	}
}
