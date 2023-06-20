package constructor;

public class Test {
	
	public static void main(String[] args) 
	{
		Employee e = new Employee(101, "abc", 8000.5f, "mmmmm");
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println(e.designation);
	}
}
