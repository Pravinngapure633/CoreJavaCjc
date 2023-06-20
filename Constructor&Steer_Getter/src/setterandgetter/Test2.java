package setterandgetter;

public class Test2 {
	
	public static void main(String[] args) {
		
		Student2 stu = new Student2(101,"ABC");
		
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		
		stu.setName("PQR");
		System.out.println(stu.getName());
		
		//stu.setRollno(102);    :student2 class madhe setRoll methoad nahi ahe
		//System.out.println(stu.getRollno());
		
	}
}
