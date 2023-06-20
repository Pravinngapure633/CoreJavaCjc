package Ways_Of_Create_Object;

public class Class_For_Name {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class c=Class.forName("Ways_Of_Create_Object.A");
		
		A a=(A)c.newInstance();
		
		System.out.println(a);
		System.out.println(a.i);
		
	}

}
