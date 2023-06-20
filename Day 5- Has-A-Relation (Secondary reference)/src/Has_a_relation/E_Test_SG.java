package Has_a_relation;

public class E_Test_SG {
	public static void main(String[] args) {
		
			E_Course_SG c = new E_Course_SG();
			c.setCid(10);
			c.setCname("java");
			c.setFees(95000d);
			c.setDuration("6-month");
			
			E_Faculty_SG f = new E_Faculty_SG();
			f.setFid(20);
			f.setFname("Saurabh sir");
			f.setSalary(100000d);
			f.setCousre(c);
			
			E_Batch_SG b = new E_Batch_SG();
			b.setBid(50);
			b.setBname("Sep-22");
			b.setFaculty(f);
			
			E_Student_SG s = new E_Student_SG();
			s.setRollno(30);
			s.setName("Pravin");
			s.setBatch(b);
			
			System.out.println(s.getRollno());
			System.out.println(s.getName());
			System.out.println(s.getBatch());
			System.out.println(s.getBatch().getBid());
			System.out.println(s.getBatch().getBname());
			System.out.println(s.getBatch().getFaculty());
			System.out.println(s.getBatch().getFaculty().getFid());
			System.out.println(s.getBatch().getFaculty().getFname());
			System.out.println(s.getBatch().getFaculty().getSalary());
			System.out.println(s.getBatch().getFaculty().getCousre());
			System.out.println(s.getBatch().getFaculty().getCousre().getCid());
			System.out.println(s.getBatch().getFaculty().getCousre().getCname());
			System.out.println(s.getBatch().getFaculty().getCousre().getFees());
			System.out.println(s.getBatch().getFaculty().getCousre().getDuration());
			
	}

}
