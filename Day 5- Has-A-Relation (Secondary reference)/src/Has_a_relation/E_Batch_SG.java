package Has_a_relation;

public class E_Batch_SG {
	
		private int bid;
		private String bname;
		private E_Faculty_SG faculty;
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public E_Faculty_SG getFaculty() {
			return faculty;
		}
		public void setFaculty(E_Faculty_SG faculty) {
			this.faculty = faculty;
		}
		
		

}
