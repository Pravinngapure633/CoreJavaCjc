package C_Overriding;

public class Test_Student {

		
		public static void main(String[] args) {
			
			Student stu1=new Student(101,"ABC");
			System.out.println(stu1.toString());
			System.out.println("------------");
			
			Student stu2=new Student(202,"QQQ");
			System.out.println(stu2.toString());
		}
}
