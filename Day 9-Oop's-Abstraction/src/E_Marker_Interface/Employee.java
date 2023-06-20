package E_Marker_Interface;

public class Employee implements Company {
	
	int eid;
	String ename;
	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"ABC");
		
		if(emp1 instanceof Company)
		{
			System.out.println(emp1.eid);
			System.out.println(emp1.ename);
			
		}
		else
		{
			System.err.println("No instance of company");
		}
	}

}
