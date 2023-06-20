 package Returntype_is_class_type;

public class B_Test_Student_SG {
	
	public B_Student_SetGet m1()
	{
		B_Student_SetGet stu = new B_Student_SetGet();
		stu.setRollno(101);
		stu.setName("ABC");	
		return stu;
	}
	 public static void main(String[] args) {
		 
		 B_Test_Student_SG s = new B_Test_Student_SG();
		 B_Student_SetGet b=s.m1();
		 System.out.println(b);
		 System.out.println(b.getRollno());
		 System.out.println(b.getName());
	}

}
