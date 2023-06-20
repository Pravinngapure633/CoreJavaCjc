package C1_Overriding_Setter_Getter;

public class Test_Student {
	
		public static void main(String[] args) {
			
				Student stu1=new Student();
				stu1.setRollno(101);
				stu1.setName("ABC");
				
				System.out.println(stu1.getRollno());
				System.out.println(stu1.getName());
				
				Student stu2=new Student();
				 stu2.setRollno(102);
				 stu2.setName("PQR");
				System.out.println(stu2.getName());
				System.out.println((stu2.getRollno()));
		}

}
