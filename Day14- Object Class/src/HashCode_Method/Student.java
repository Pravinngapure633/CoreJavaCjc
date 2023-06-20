package HashCode_Method;

public class Student {
	
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode()	//only  for int
	{
		return rollno;
	}
	

}
