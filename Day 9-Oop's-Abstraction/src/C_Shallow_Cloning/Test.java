package C_Shallow_Cloning;

public class Test {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student(101,"ABC");
		
		System.out.println(stu1.rollno);
		System.out.println(stu1.name);
		
		System.out.println("-------");
		
		Student stu2=stu1;
		
		stu2.rollno=200;
		stu2.name="XXX";
		
		System.out.println(stu1.rollno);
		System.out.println(stu1.name);
		
		System.out.println("---------");
		
		System.out.println(stu2.rollno);
		System.out.println(stu2.name);
	}

}
