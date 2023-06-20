package Has_a_relation;

public class E_Student_SG {

		private int rollno;
		private String name;
		private E_Batch_SG batch;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public E_Batch_SG getBatch() {
			return batch;
		}
		public void setBatch(E_Batch_SG batch) {
			this.batch = batch;
		}
		
		
}
