package Equal_Method;

public class Student 
{

	int rollno;
	String name;
	int age;

	
	

	@Override
	public boolean equals(Object o)
	{
		try 
		 {
				Student stu=(Student)o;
			
				if(stu==this)
				{
				   return true;
				}
				else
				{
					if(stu.rollno==this.rollno && stu.name== this.name && stu.age==this.age)
					{
						return true;
					}
					else
					{
						return false;
					}
				}
		 }
				catch(ClassCastException e)
				{
					return false;
				}
				catch(NullPointerException e)
				{
					return false;
				}
		 }
		
		
				public Student(int rollno, String name, int age)
				{
					super();
					this.rollno = rollno;
					this.name = name;
					this.age = age;
				}

}
