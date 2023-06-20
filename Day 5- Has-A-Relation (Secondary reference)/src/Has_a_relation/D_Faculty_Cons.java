package Has_a_relation;

public class D_Faculty_Cons {

		int fid;
		String fname;
		double salary;
		D_Course_Cons course;
		public D_Faculty_Cons(int fid, String fname, double salary, D_Course_Cons course) {
			
			this.fid = fid;
			this.fname = fname;
			this.salary = salary;
			this.course = course;
		}
		
		
		
}
