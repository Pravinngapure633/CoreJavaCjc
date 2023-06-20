package D_Deep_Cloning;

public class Deepclone {
	
	public static void main(String[] args) throws Exception 
	{
		Student  stu1 = new Student (101,"ABC");
		
		System.out.println(stu1.rollno);
		System.out.println(stu1.name);
		
		System.out.println("------");
		
		Student stu2=stu1.clone();
		stu2.rollno=200;
		stu2.name="XXX";
		
		System.out.println(stu2.rollno);
		System.out.println(stu2.name);
		
		System.out.println("--------");
		System.out.println(stu1.rollno);
		System.out.println(stu1.name);
		
		
	}

}
