package Equal_Operator;

public class Student {
	
	private int rollno;
	private String name;
	
	
	public Student(int rollno, String name) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == this)
		{
			return true;
		}
		if(o instanceof Student)
		{
			Student stu=(Student)o;
			
			if(this.rollno==stu.rollno && this.name.equals(stu.name))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	
	
	
	

}
