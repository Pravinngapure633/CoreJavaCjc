package Equal_Operator;

public class Test {
	
	public static void main(String[] args) {
		
			Student stu1=new Student(101,"RAM");
			
			Student stu2=new Student(102,"SHAM");
			
			
			System.out.println(stu1);	//@15db
			
			System.out.println(stu2); 	//@6d06
			
			System.out.println(stu1.equals(stu2));
			
			System.out.println(stu1.equals(stu1));
			
			System.out.println(stu1.equals(null));
	}

}
