package One_D_Array;

public class D_Test {
	
	public static void main(String[] args) {
		
		D_Student[] stu = new D_Student[3];
		
		stu[0]=new D_Student(101,"abc","pune");
		stu[1]=new D_Student(102,"pqr","mumbai");
		stu[2]=new D_Student(103,"xyz","nashik");
		
		for(int i=0; i<stu.length; i++)
		{
			D_Student s1=stu[i];
			System.out.println(s1.getRollno());
			System.out.println(s1.getName());
			System.out.println(s1.getAddress());
			
		}
			
	}

}
