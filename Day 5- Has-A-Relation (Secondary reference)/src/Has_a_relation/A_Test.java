package Has_a_relation;

public class A_Test {
		
		public static void main(String[] args) {
			
			//Address student ka dependency hai then 1st create object of address
			A_Address adr = new A_Address();
			adr.areaname="Akurdi";
			adr.cityname="Pune";
			adr.pincode=4411033;
			System.out.println(adr);
			
			A_Student stu=new A_Student();
			stu.rollno=101;
			stu.name="pravin";
			stu.address=adr;
			
			System.out.println(stu.rollno);
			System.out.println(stu.name);
			System.out.println(stu.address);
			System.out.println(stu.address.areaname);
			System.out.println(stu.address.cityname);
			System.out.println(stu.address.pincode);
			
			
		}

}
