package Equal_Method;

public class Test {

	public static void main(String[] args) {
		
		Student stu=new Student(101,"ABC",18);
		Student stu1=new Student(102,"PQR",23);
		
		System.out.println(stu.equals(stu)); //stu=stu true
		
		System.out.println(stu.equals(stu1));//false
		
		System.out.println(stu.equals(null)); //false
		
		System.out.println(stu.equals(new Test()));//false
		
	}
}
