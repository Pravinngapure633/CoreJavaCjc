package Has_a_relation;

public class E_Faculty_SG {
	
		private int fid;
		private String fname;
		private double salary;
		private E_Course_SG cousre;
		public int getFid() {
			return fid;
		}
		public void setFid(int fid) {
			this.fid = fid;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public E_Course_SG getCousre() {
			return cousre;
		}
		public void setCousre(E_Course_SG cousre) {
			this.cousre = cousre;
		}
		
		

}
