package D_Deep_Cloning;

public class Student  implements Cloneable {
	
	int rollno;
	String name;
	
	
	public Student(int rollno, String name) {
		
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	protected Student clone() throws CloneNotSupportedException
	{
		return (Student) super.clone();
	}
	
	
	

}
