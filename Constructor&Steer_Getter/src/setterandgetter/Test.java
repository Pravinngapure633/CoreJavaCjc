package setterandgetter;

public class Test {
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.setCount(500);
		
		A a1 = new A();
		a1.setCount(100);
		
		System.out.println(a.getCount());
		System.out.println(a1.getCount());
		
		Student s = new Student();
		s.setRollno(32);
		
		Student s1 = new Student();
		s1.setName("pravin");
		
		System.out.println("ROLL NO IS:"+s.getRollno());
		System.out.println("NAME IS:"+s1.getName());
		
	}
}
