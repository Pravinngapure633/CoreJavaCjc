  package setterandgetter;

public class Test1 {
	public static void main(String[] args) {
		
		Student1 stu = new Student1();
			stu.setRollno(101);
			stu.setName("ABC");
			System.out.println(stu.getRollno());
			String s=stu.getName();
			System.out.println(s);
			
			stu.setRollno(102);
			System.out.println(stu.getRollno());
			stu.setName("PRAVIN");
			System.out.println(stu.getName());
			
	}

}
