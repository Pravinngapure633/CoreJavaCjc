package Has_a_relation;

public class D_Test_Cons {
	
	public static void main(String[] args) {
		
		D_Course_Cons c = new D_Course_Cons(101,"java",95000d,"6-month");
		
		D_Faculty_Cons f = new D_Faculty_Cons(10,"Saurabh sir",100000d,c);
		
		D_Batch_Cons b = new D_Batch_Cons(20,"Sep-22",f);
		
		D_Student_Cons s = new D_Student_Cons(30,"Pravin",b);
		
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.batch);
		System.out.println(s.batch.bid);
		System.out.println(s.batch.bname);
		System.out.println(s.batch.faculty);
		System.out.println(s.batch.faculty.fid);
		System.out.println(s.batch.faculty.fname);
		System.out.println(s.batch.faculty.salary);
		System.out.println(s.batch.faculty.course);
		System.out.println(s.batch.faculty.course.cid);
		System.out.println(s.batch.faculty.course.cname);
		System.out.println(s.batch.faculty.course.fees);
		System.out.println(s.batch.faculty.course.duration);
		
		
	}
}
