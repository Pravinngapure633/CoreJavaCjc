package constructor;

public class Employee {
	int id;
	String name;
	float salary;
	String designation;
	
	public Employee(int id, String name, float salary, String designation)		// parametrized constructor
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
	}
}
