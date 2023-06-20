package Has_a_relation;

public class B_Test_SG {
	
	public static void main(String[] args) {
		
		B_Employee_SG emp = new B_Employee_SG();
		emp.setEid(101);
		emp.setEname("PRAVIN");
		emp.setSalary(100000d);
		
		B_Department_SG dep = new B_Department_SG();
		dep.setDid(10);
		dep.setName("Soft Eng");
		dep.setEmployee(emp);
		
		System.out.println(dep.getDid());
		System.out.println(dep.getName());
		System.out.println(dep.getEmployee());
		System.out.println(dep.getEmployee().getEid());
		System.out.println(dep.getEmployee().getEname());
		System.out.println(dep.getEmployee().getSalary());
		
	}
}
