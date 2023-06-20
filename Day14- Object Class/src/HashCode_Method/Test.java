package HashCode_Method;

public class Test {

	public static void main(String[] args) {
		
		Student stu=new Student(101,"ABC",18);
		Student stu1=new Student(102,"PQR",18);
		Student stu2=new Student(103,"ABC",18);
		
		System.out.println(stu.hashCode());
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
	}
}
