package Has_a_relation;

public class C_Test_Simple {
	public static void main(String[] args) {
		
			C_Course_Simple c = new C_Course_Simple();
			c.cid=101;
			c.cname="java";
			c.fees=95000d;
			c.duration="3mom";
			
			C_Faculty_Simple f = new C_Faculty_Simple();
			f.fid=10;
			f.fname="Saurabh sir";
			f.salary=100000d;
			f.course=c;
			
			C_Batch_Simple b = new C_Batch_Simple();
			b.bid=20;
			b.bname="sep-22";
			b.faculty=f;
			
			C_Student_Simple s = new C_Student_Simple();
			s.rollno=30;
			s.name="Pravin";
			s.batch=b;
			
			
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
