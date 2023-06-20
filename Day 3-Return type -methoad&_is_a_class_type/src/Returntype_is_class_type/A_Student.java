package Returntype_is_class_type;

public class A_Student {
		
		int rollno;
		
	public int m1()
	{
		return 10;
	}
	
	//A_Student is a class name
	public A_Student m2()	
	{
		A_Student s = new A_Student();
		s.rollno=100;
		return s;
	}
	
}
