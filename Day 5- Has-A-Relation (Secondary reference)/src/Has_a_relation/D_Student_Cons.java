package Has_a_relation;

public class D_Student_Cons {

	int rollno;
	String name;
	D_Batch_Cons batch;

	public D_Student_Cons(int rollno, String name, D_Batch_Cons batch) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.batch = batch;
	}

}
