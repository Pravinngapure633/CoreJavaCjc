package Has_a_relation;

public class D_Batch_Cons {

	int bid;
	String bname;
	D_Faculty_Cons faculty;

	public D_Batch_Cons(int bid, String bname, D_Faculty_Cons faculty) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.faculty = faculty;
	}

}
