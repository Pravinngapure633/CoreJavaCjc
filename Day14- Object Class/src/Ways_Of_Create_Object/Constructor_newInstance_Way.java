package Ways_Of_Create_Object;

import java.lang.reflect.Constructor;

public class Constructor_newInstance_Way {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		Class c=Class.forName("Ways_Of_Create_Object.A");
		
		Constructor c1=c.getDeclaredConstructor();
		
		A a=(A) c1.newInstance();
		
		System.out.println(a);
		System.out.println(a.i);
		
	}
}
