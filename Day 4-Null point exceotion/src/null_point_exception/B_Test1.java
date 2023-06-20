package null_point_exception;

public class B_Test1 {
	
	public A_Student_SG m1()
	{
		A_Student_SG stu=new A_Student_SG();
			stu.setRollno(101);
			stu.setName("ABC");
			return null;
	}
	
	public static void main(String[] args) {
			
			B_Test1 t = new B_Test1();
			A_Student_SG stu=t.m1();
			
			System.out.println(stu);
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			
	}
}
