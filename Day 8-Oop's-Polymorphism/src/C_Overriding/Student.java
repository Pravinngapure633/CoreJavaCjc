package C_Overriding;

public class Student {
	
		private int rollno;
		private String name;
		
		public Student (int rollno, String name)
		{
			super();
			this.rollno=rollno;
			this.name=name;
		}
		
		@Override
		public String toString()
		{
			return "Student Rollno: "+rollno+"\nStudent Name: "+name; 
		}
		

}
