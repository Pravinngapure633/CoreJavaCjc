package setterandgetter;

public class Student2 {
	
		private int rollno;
		private String name;
	//by using constructor
	public Student2(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	//setter
	public void setName(String name)
	{
		this.name=name;
	}

	//getter
	public int getRollno()
	{
		return rollno;
	}
	public String getName() {
		return name;
	}

}
