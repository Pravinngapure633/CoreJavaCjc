package setterandgetter;

public class Student1 {
	private int rollno;
	private String name;
	
	// setter method
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public void setName(String nm)
	{
		name=nm;
	}
	
	//getter method
	public int getRollno()
	{
		return rollno;
	}
	public String getName() 
	{
		return name;
	}
}
