package String__Method;

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
	public String toString()
	{
		return "Student rollno:"+rollno+"\n Name:"+name+"\n age:"+age;
	}

	
}
